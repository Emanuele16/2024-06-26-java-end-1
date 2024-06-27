package Esercizi.ES7;

public class Manager extends Impiegato {
    private int bonus;

    public Manager(String nome, int salario, int bonus) {
        super(nome, salario);
        controllaValoreNonNegativo(bonus, "Il bonus non può essere negativo.");
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    @Override
    public void aumentaSalario(int percentuale) {
        controllaValoreNonNegativo(percentuale, "La percentuale di aumento non può essere negativa.");
        int salarioConBonus = getSalario() + bonus, aumento = salarioConBonus * percentuale / 100, nuovoSalario = getSalario() + aumento * getSalario() / salarioConBonus;
        bonus += aumento - (nuovoSalario - getSalario());
        super.aumentaSalario(aumento * getSalario() / salarioConBonus);
    }

    private void controllaValoreNonNegativo(int valore, String messaggio) {
        if (valore < 0) {
            throw new IllegalArgumentException(messaggio);
        }
    }

    @Override
    public String toString() {
        return "Manager: " + getNome() + ", Salario: " + getSalario() + ", Bonus: " + bonus;
    }
}