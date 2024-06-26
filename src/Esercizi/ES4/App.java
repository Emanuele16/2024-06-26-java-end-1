package Esercizi.ES4;

public class App {
    static Contatto contatto1, contatto2, contatto3;
    static ElencoTelefonico elencoTelefonico;
    public static void main(String[] args) throws NumeroNonValidoException{
        contatto1 = new Contatto("marco", "1234567891");
        contatto2 = new Contatto("marco2", "9876543210");
        contatto3 = new Contatto("marco3", "0101010101");
        elencoTelefonico = new ElencoTelefonico();
        addContatti();
        rimuoviContatti();
        cercaContatto();
        stampaElenco();
    }

    public static void addContatti(){
        elencoTelefonico.aggiungiContatto(contatto1);
        elencoTelefonico.aggiungiContatto(contatto2);
        elencoTelefonico.aggiungiContatto(contatto3);
        System.out.println("hai aggiunto il contatto: "+ contatto1.getNumeroTelefono()+" e: "+ contatto2.getNumeroTelefono());
    }

    public static void rimuoviContatti(){
        System.out.println(elencoTelefonico.rimuoviContatto(contatto1.getNumeroTelefono()));
    }

    public static void cercaContatto(){
        System.out.println("contatto trovato: "+elencoTelefonico.cercaContatto(contatto2.getNumeroTelefono()));
    }

    public static void stampaElenco(){
        System.out.println(elencoTelefonico);
    }
}