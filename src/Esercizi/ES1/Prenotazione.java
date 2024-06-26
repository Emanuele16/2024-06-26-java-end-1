package Esercizi.ES1;

public class Prenotazione {
    private boolean[] postiTeatro;

    public Prenotazione(int nPosti){
        postiTeatro = new boolean[nPosti];
    }

    private void verificaPosto(int nPosto) {
        if (nPosto < 0 || nPosto >= postiTeatro.length) {
            throw new IllegalArgumentException("Numero di posto non valido.");
        }
    }

    public boolean prenota(int nPosto){
        verificaPosto(nPosto);
        
        if (!postiTeatro[nPosto]) {
            postiTeatro[nPosto] = true;
            return true;
        } 
        return false;
    }

    public boolean annullaPrenotazione(int nPosto) {
        verificaPosto(nPosto);
        
        if (postiTeatro[nPosto]) {
            postiTeatro[nPosto] = false;
            return true;
        } 
        return false;
    }

    public boolean postoDisponibile(int nPosto) {
        verificaPosto(nPosto);
        return !postiTeatro[nPosto];
    }

    public boolean postiDisponibili(int[] posti) {
        for (int nPosto : posti) {
            verificaPosto(nPosto);
            if (postiTeatro[nPosto]) {
                return false;
            }
        }
        return true;
    }
}