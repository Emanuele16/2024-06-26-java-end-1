package Esercizi.ES3;

public class ContoBancario {
    private int saldo;
    
    public ContoBancario(int saldo) {
        this.saldo = saldo;
    }
    
    public int deposita(int deposito) throws ValoreNonValidoException {
        if (deposito <= 0) {
            throw new ValoreNonValidoException("Il valore inserito come deposito non è valido");
        } 
        saldo += deposito;
        return getSaldo();
    }
    
    public int preleva(int prelievo) throws FuoriSaldoException {
        if (saldo < prelievo) {
            throw new FuoriSaldoException("Il tuo saldo è inferiore a: " + prelievo + " euro.");
        } 
        
        else {
            saldo -= prelievo;
            return getSaldo();
        }
    }
    
    public int getSaldo() {
        return saldo;
    }
}