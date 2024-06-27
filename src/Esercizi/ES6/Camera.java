package Esercizi.ES6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Camera {
    private int nCamera;
    private String type;
    private List<Prenotazione> prenotazioni;

    public Camera(int nCamera, String type) {
        this.nCamera = nCamera;
        this.type = type;
        this.prenotazioni = new ArrayList<>();
    }

    public int getnCamera() {
        return nCamera;
    }

    public String getType() {
        return type;
    }

    public boolean isDisponibile(LocalDate dataInizio, LocalDate dataFine) {
        for (Prenotazione prenotazione : prenotazioni) {
            if (prenotazione.confilittoDate(dataInizio, dataFine)) {
                return false;
            }
        }
        return true;
    }

    public void aggiungiPrenotazione(Prenotazione prenotazione) {
        prenotazioni.add(prenotazione);
    }

    public void rimuoviPrenotazione(Prenotazione prenotazione) {
        prenotazioni.remove(prenotazione);
    }
}