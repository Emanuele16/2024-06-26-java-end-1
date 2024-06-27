package Esercizi.ES8;


import java.util.ArrayList;
import java.util.List;

public class Albergo {

    private String name;
    private List<CameraAlbergo> listaCamere;

    public Albergo() {

        listaCamere = new ArrayList<>();
    }

    public List<CameraAlbergo> getListaCamere() {
        return listaCamere;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCamera(CameraAlbergo camera) {

        listaCamere.add(camera);
    }

    public void removeCamera(int index) {

        listaCamere.remove(index);
    }

    public void clear() {

        listaCamere.clear();
    }

    @Override
    public String toString() {

        String res = getName() + ": " + listaCamere.size() + "\n";

        for (CameraAlbergo c : getListaCamere())
            res += c + "\n";

        return res;
    }
}
