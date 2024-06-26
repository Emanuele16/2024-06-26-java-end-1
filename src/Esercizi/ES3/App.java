package Esercizi.ES3;

public class App {
    static ContoBancario conto;

    public static void main(String[] args) {
        conto = new ContoBancario(100);
        execute();
    }

    public static void execute() {
        testDeposito();
        testPrelievo();
        testgetSaldo();
    }

    public static void testDeposito() {
        testgetSaldo();
        try {
            System.out.println("saldo dopo il deposito: " + conto.deposita(50) + " euro");
        } 
        catch (ValoreNonValidoException e) {
            System.out.println("Errore durante il deposito: " + e.getMessage());
        }
    }

    public static void testPrelievo() {
        try {
            System.out.println("saldo dopo il prelievo: " + conto.preleva(100) + " euro");
        } 
        catch (FuoriSaldoException e) {
            System.out.println("Errore durante il prelievo: " + e.getMessage());
        }
    }

    public static void testgetSaldo() {
        System.out.println("il tuo saldo è di: " + conto.getSaldo() + " euro");
    }
}