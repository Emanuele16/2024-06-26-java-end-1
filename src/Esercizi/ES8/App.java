package Esercizi.ES8;

public class App {
    public static void main(String[] args) throws Exception {
        testAlbergo();
    }

    public static void testAlbergo() {

        CameraAlbergo c1 = new CameraSingola(1);
        CameraAlbergo c2 = new CameraSingola(2);
        CameraAlbergo c3 = new CameraDoppia(3);
        CameraAlbergo c4 = new CameraDoppia(4);
        CameraAlbergo c5 = new Suite(5);
    
        Suite s1 = new Suite(6);
        CameraAlbergo c6 = s1;
    
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("c3: " + c3);
        System.out.println("c4: " + c4);
        System.out.println("c5: " + c5);
        System.out.println("c6: " + c6);
    
        s1.setVasca(true);
        System.out.println("c6: " + c6);
    
        System.out.println("-------------------------------------------------------------------");
    
        Albergo a = new Albergo();
    
        a.addCamera(c1);
        a.addCamera(c2);
        a.addCamera(c3);
        a.addCamera(c4);
        a.addCamera(c5);
        a.addCamera(c6);
    
        System.out.println("Albergo:\n" + a);
    }
}