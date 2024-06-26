package Esercizi.ES2;

import java.util.ArrayList;

public class Studente {
    private String nome;
    private String matricola;
    private ArrayList<Integer> voti;

    public Studente(String nome, String matricola) {
        this.nome = nome;
        this.matricola = matricola;
        this.voti = new ArrayList<>();
    }

    public void aggiungiVoto(int voto) {
        if (voto < 0 || voto > 10) {
            throw new IllegalArgumentException("Il voto deve essere compreso tra 0 e 10.");
        }
        voti.add(voto);
    }

    public double mediaVoti() {
        if (voti.isEmpty()) {
            throw new IllegalStateException("non ci sono voti per fare la media");
        }
        double media = voti.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        return media;
    }

    @Override
    public String toString() {
        return "Studente [" +
                "nome: " + nome +
                ", matricola: " + matricola +
                ", voti: " + voti +
                ", media: " + mediaVoti() +
                ']';
    }
}