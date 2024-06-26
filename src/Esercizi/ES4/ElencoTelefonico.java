package Esercizi.ES4;

import java.util.ArrayList;
import java.util.List;

public class ElencoTelefonico {
    private List<Contatto> contatti;

    public ElencoTelefonico() {
        contatti = new ArrayList<>();
    }

    public void aggiungiContatto(Contatto contatto) {
        contatti.add(contatto);
    }

    public String rimuoviContatto(String numero) {
        if(contatti.removeIf(contatto -> contatto.getNumeroTelefono().equals(numero))){
            return "contatto "+ numero + " rimosso";
        }
        else{
            return "contatto insesistente";
        }
    }

    public Contatto cercaContatto(String numero) {
        for (Contatto contatto : contatti) {
            if (contatto.getNumeroTelefono().equals(numero)) {
                return contatto;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Elenco Telefonico:\n");
        for (Contatto contatto : contatti) {
            sb.append(contatto.getNome()).append(": ").append(contatto.getNumeroTelefono()).append("\n");
        }
        return sb.toString();
    }
}