package Esercizi.ES1;

public class App {
    static Prenotazione teatro;
    public static void main(String[] args) throws Exception {
        teatro = new Prenotazione(10);
        prenota();
        annullaPrenotazione();
        postoDisponibile();
        postiDisponibili();
    }

    public static void prenota(){
        System.out.println("Prenotazione posto 1: " + teatro.prenota(1));
        System.out.println("Prenotazione posto 1 di nuovo: " + teatro.prenota(1));
        System.out.println("Prenotazione posto 7: " + teatro.prenota(7));
        //System.out.println("Prenotazione posto 12 (non esiste): " + teatro.prenota(12));
    }

    public static void annullaPrenotazione(){
        System.out.println("Annulla Prenotazione posto 1: " + teatro.annullaPrenotazione(1));
        System.out.println("Test Prenotazione posto 1: " + teatro.prenota(1));
    }

    public static void postoDisponibile(){
        System.out.println("Controllo se posto 1 è disponibile: " + teatro.postoDisponibile(1));
        System.out.println("Controllo se posto 8 è già prenotato: " + teatro.postoDisponibile(8));
    }

    public static void postiDisponibili(){
        int[] postiDaVerificare = {1, 2, 3, 4};
        System.out.println("Posti da 1 a 4 disponibili: " + teatro.postiDisponibili(postiDaVerificare));
    }
}
