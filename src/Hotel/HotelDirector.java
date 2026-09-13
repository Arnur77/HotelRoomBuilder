package Hotel;

public class HotelDirector {

    public HotelRoom buildStandardRoom() {
        return new StandardRoomBuilder()
                .setRoomType("Standard")
                .setBedType("Double Bed")
                .setFloor(2)
                .setBalcony(false)
                .setSeaView(false)
                .setBreakfast(false)
                .setPrice(20000)
                .build();
    }

    public HotelRoom buildLuxuryRoom() {
        return new LuxuryRoomBuilder()
                .setRoomType("Luxury")
                .setBedType("King Size")
                .setFloor(10)
                .setBalcony(true)
                .setSeaView(true)
                .setBreakfast(true)
                .setPrice(50000)
                .build();
    }
}