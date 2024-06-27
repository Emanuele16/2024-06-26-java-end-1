package Esercizi.ES8;

public abstract class CameraAlbergo {

    int numeroLetti;

    public CameraAlbergo(int numeroLetti) {

        setNumeroLetti(numeroLetti);
    }

    public int getNumeroLetti() {
        return numeroLetti;
    }

    public void setNumeroLetti(int numeroLetti) {
        this.numeroLetti = numeroLetti;
    }

    abstract int calcolaCosto();

    @Override
    public String toString() {

        return "Camera:\nNumero letti: " + getNumeroLetti() + "\nCosto: " + calcolaCosto() + "\n";
    }
}
