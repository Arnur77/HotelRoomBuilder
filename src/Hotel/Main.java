package Hotel;

public class Main {

    public static void main(String[] args) {

        HotelDirector director = new HotelDirector();

        HotelRoom standardRoom = director.buildStandardRoom();
        HotelRoom luxuryRoom = director.buildLuxuryRoom();

        System.out.println("=== STANDARD ROOM ===");
        System.out.println(standardRoom);

        System.out.println("=== LUXURY ROOM ===");
        System.out.println(luxuryRoom);
    }
}