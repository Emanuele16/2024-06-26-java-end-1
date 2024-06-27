package Esercizi.ES7;

public class Impiegato {
    private String nome;
    private int salario;

    public Impiegato(String nome, int salario) {
        controllaValoreNonNegativo(salario, "Il salario non può essere negativo.");
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public int getSalario() {
        return salario;
    }

    public void aumentaSalario(int percentuale) {
        controllaValoreNonNegativo(percentuale, "La percentuale di aumento non può essere negativa.");
        salario += salario * percentuale / 100;
    }

    private void controllaValoreNonNegativo(int valore, String messaggio) {
        if (valore < 0) {
            throw new IllegalArgumentException(messaggio);
        }
    }

    @Override
    public String toString() {
        return "Impiegato: " + nome + ", Salario: " + salario;
    }
}