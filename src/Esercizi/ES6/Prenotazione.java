package Esercizi.ES6;

import java.time.LocalDate;

public class Prenotazione {
    private Cliente cliente;
    private Camera camera;
    private LocalDate primaData;
    private LocalDate ultimaData;

    public Prenotazione(Cliente cliente, Camera camera, LocalDate primaData, LocalDate ultimaData) {
        this.cliente = cliente;
        this.camera = camera;
        this.primaData = primaData;
        this.ultimaData = ultimaData;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Camera getCamera() {
        return camera;
    }

    public LocalDate getPrimaData() {
        return primaData;
    }

    public LocalDate getUltimaData() {
        return ultimaData;
    }

    public boolean confilittoDate(LocalDate dataInizio, LocalDate dataFine) {
        return !(dataFine.isBefore(this.primaData) || dataInizio.isAfter(this.ultimaData));
    }
}
