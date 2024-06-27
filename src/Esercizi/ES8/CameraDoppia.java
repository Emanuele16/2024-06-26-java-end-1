package Esercizi.ES8;


public class CameraDoppia extends CameraAlbergo {

    public static final int costoPerLetto = 70;
    public static final int costoMinibar = 30;

    private boolean minibar;

    public CameraDoppia(int numeroLetti) {

        super(numeroLetti);

        setMinibar(false);
    }

    public boolean isMinibar() {
        return minibar;
    }

    public void setMinibar(boolean minibar) {

        this.minibar = minibar;
    }

    @Override
    int calcolaCosto() {

        return costoPerLetto * getNumeroLetti() + (isMinibar() ? costoMinibar : 0);
    }

    @Override
    public String toString() {

        return super.toString() + "Minibar: " + (isMinibar() ? "Si" : "No") + "\n";
    }
}
