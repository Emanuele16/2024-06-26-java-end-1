package Esercizi.ES6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hotel {
    private List<Camera> camereDisponibili;
    private Map<Cliente, Prenotazione> prenotazioni;

    public Hotel() {
        camereDisponibili = new ArrayList<>();
        prenotazioni = new HashMap<>();
    }

    public void aggiungiCamera(Camera camera) {
        camereDisponibili.add(camera);
    }

    public void effettuaPrenotazione(Cliente cliente, LocalDate dataInizio, LocalDate dataFine) throws Exception {
        if (dataInizio.isAfter(dataFine) || dataInizio.isBefore(LocalDate.now())) {
            throw new Exception("Le date di prenotazione non sono valide");
        }

        Camera cameraDisponibile = null;
        for (Camera camera : camereDisponibili) {
            if (camera.isDisponibile(dataInizio, dataFine)) {
                cameraDisponibile = camera;
                break;
            }
        }

        if (cameraDisponibile == null) {
            throw new Exception("Nessuna camera disponibile per il periodo richiesto");
        }

        Prenotazione prenotazione = new Prenotazione(cliente, cameraDisponibile, dataInizio, dataFine);
        prenotazioni.put(cliente, prenotazione);
        cameraDisponibile.aggiungiPrenotazione(prenotazione);
    }

    public void modificaPrenotazione(Cliente cliente, LocalDate nuovaDataInizio, LocalDate nuovaDataFine) throws Exception {
        if (nuovaDataInizio.isAfter(nuovaDataFine) || nuovaDataInizio.isBefore(LocalDate.now())) {
            throw new Exception("Le nuove date di prenotazione non sono valide");
        }

        Prenotazione prenotazione = prenotazioni.get(cliente);
        if (prenotazione == null) {
            throw new Exception("Prenotazione non trovata");
        }

        Camera camera = prenotazione.getCamera();
        camera.rimuoviPrenotazione(prenotazione);

        if (camera.isDisponibile(nuovaDataInizio, nuovaDataFine)) {
            Prenotazione nuovaPrenotazione = new Prenotazione(cliente, camera, nuovaDataInizio, nuovaDataFine);
            prenotazioni.put(cliente, nuovaPrenotazione);
            camera.aggiungiPrenotazione(nuovaPrenotazione);
        } else {
            camera.aggiungiPrenotazione(prenotazione);
            throw new Exception("La camera non è disponibile per il nuovo periodo richiesto");
        }
    }

    public void cancellaPrenotazione(Cliente cliente) throws Exception {
        Prenotazione prenotazione = prenotazioni.get(cliente);
        if (prenotazione == null) {
            throw new Exception("Prenotazione non trovata");
        }

        LocalDate oggi = LocalDate.now();
        if (oggi.isAfter(prenotazione.getPrimaData().minusDays(1))) {
            throw new Exception("Cancellazione tardiva non permessa");
        }

        Camera camera = prenotazione.getCamera();
        camera.rimuoviPrenotazione(prenotazione);
        prenotazioni.remove(cliente);
    }

    public List<Camera> getCamereDisponibili() {
        return camereDisponibili;
    }

    public Map<Cliente, Prenotazione> getPrenotazioni() {
        return prenotazioni;
    }
}