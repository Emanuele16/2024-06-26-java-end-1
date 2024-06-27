package Esercizi.ES8;


public class Suite extends CameraAlbergo {

    public static final int costoPerLetto = 100;
    public static final int costoVasca = 50;

    private boolean vasca;

    public Suite(int numeroLetti) {

        super(numeroLetti);

        setVasca(false);
    }

    public boolean isVasca() {
        return vasca;
    }

    public void setVasca(boolean vasca) {

        this.vasca = vasca;
    }

    @Override
    int calcolaCosto() {

        return costoPerLetto * getNumeroLetti() + (isVasca() ? costoVasca : 0);
    }

    @Override
    public String toString() {

        return super.toString() + "Vasca: " + (isVasca() ? "Si" : "No") + "\n";
    }
}
