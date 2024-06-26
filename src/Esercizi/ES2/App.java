package Esercizi.ES2;
public class App {
    static Studente studente;
    public static void main(String[] args) throws Exception {
        studente = new Studente("MARIO", "M49O");
        addVoto();
        media();
        cartellaStudente();
    }

    public static void addVoto(){
        studente.aggiungiVoto(6);
        studente.aggiungiVoto(6);
        studente.aggiungiVoto(5);

        System.out.println("voti aggiunti");
    }

    public static void media(){
        System.out.println("media: "+studente.mediaVoti());
    }

    public static void cartellaStudente(){
        System.out.println(studente);
    }
}