package Esercizi.ES4;

public class Contatto {
    private String nome;
    private String numeroTelefono;

    public Contatto(String nome, String numeroTelefono) throws NumeroNonValidoException {
        if (!ValidatoreNumeroTelefono(numeroTelefono)) {
            throw new NumeroNonValidoException("Il numero di telefono non è valido");
        }
        this.nome = nome;
        this.numeroTelefono = numeroTelefono;
    }

    private boolean ValidatoreNumeroTelefono(String numero) {
        return numero.matches("\\d{10}");
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    @Override
    public String toString() {
        return nome + ": " + numeroTelefono;
    }
}