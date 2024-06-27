package Esercizi.ES7;

public class App {
    static Impiegato[] impiegati;
    public static void main(String[] args) {
        impiegati = new Impiegato[3];
        creaImpiegati();
        aumentaSalario();
        stampaImpiegati();
    }



    public static void creaImpiegati() {
        impiegati[0] = new Impiegato("Mario Rossi", 3000);
        impiegati[1] = new Manager("Luigi Bianchi", 5000, 1000);
        impiegati[2] = new Impiegato("Anna Verdi", 4000);
    }

    public static void aumentaSalario() {
        for (Impiegato imp : impiegati) {
            imp.aumentaSalario(3);
        }
    }

    public static void stampaImpiegati() {
        for (Impiegato imp : impiegati) {
            System.out.println(imp);
        }
    }
}
