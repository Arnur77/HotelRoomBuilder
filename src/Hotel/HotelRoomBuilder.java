package Hotel;

public interface HotelRoomBuilder {

    HotelRoomBuilder setRoomType(String roomType);

    HotelRoomBuilder setBedType(String bedType);

    HotelRoomBuilder setFloor(int floor);

    HotelRoomBuilder setBalcony(boolean hasBalcony);

    HotelRoomBuilder setSeaView(boolean hasSeaView);

    HotelRoomBuilder setBreakfast(boolean breakfastIncluded);

    HotelRoomBuilder setPrice(int price);

    HotelRoom build();
}