package Esercizi.ES8;


public class CameraSingola extends CameraAlbergo {

    public static final int costoPerLetto = 50;

    public CameraSingola(int numeroLetti) {

        super(numeroLetti);
    }

    @Override
    int calcolaCosto() {

        return costoPerLetto * getNumeroLetti();
    }
}
