package Esercizi.ES6;

import java.time.LocalDate;

public class App {
   static Hotel hotel;
   static Camera camera1, camera2, camera3;
   static Cliente cliente1,cliente2;
    public static void main(String[] args) {
        hotel = new Hotel();
        camera1 = new Camera(104, "Singola");
        camera2 = new Camera(208, "Doppia");
        camera3 = new Camera(102, "Doppia");
        cliente1 = new Cliente("Mario", "Rossi");
        cliente2 = new Cliente("Luigi", "Bianchi");
        addCamera();
        prenota();
        cancellaPrenotazione();
        modificaPrenotazione();

    }

    public static void addCamera(){
        hotel.aggiungiCamera(camera1);
        hotel.aggiungiCamera(camera2);
    }

    public static void prenota(){
        try {
            hotel.effettuaPrenotazione(cliente1, LocalDate.of(2024, 7, 1), LocalDate.of(2024, 8, 10));
            System.out.println("Prenotazione effettuata per " + cliente1.getNome());
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            hotel.effettuaPrenotazione(cliente2, LocalDate.of(2024, 7, 1), LocalDate.of(2024, 7, 10));
            System.out.println("Prenotazione effettuata per " + cliente2.getNome());
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            hotel.effettuaPrenotazione(cliente1, LocalDate.of(2024, 9, 1), LocalDate.of(2024, 12, 10));
            System.out.println("Prenotazione effettuata per " + cliente1.getNome());
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void cancellaPrenotazione(){
        try {
            hotel.cancellaPrenotazione(cliente1);
            System.out.println("Prenotazione cancellata per " + cliente1.getNome());
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void modificaPrenotazione(){
        try {
            hotel.modificaPrenotazione(cliente2, LocalDate.of(2024, 7, 5), LocalDate.of(2024, 7, 15));
            System.out.println("Prenotazione modificata per " + cliente2.getNome());
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}