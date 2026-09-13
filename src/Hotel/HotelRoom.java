package Hotel;

public class HotelRoom {

    private final String roomType;
    private final String bedType;
    private final int floor;
    private final boolean hasBalcony;
    private final boolean hasSeaView;
    private final boolean breakfastIncluded;
    private final int price;

    public HotelRoom(
            String roomType,
            String bedType,
            int floor,
            boolean hasBalcony,
            boolean hasSeaView,
            boolean breakfastIncluded,
            int price) {

        this.roomType = roomType;
        this.bedType = bedType;
        this.floor = floor;
        this.hasBalcony = hasBalcony;
        this.hasSeaView = hasSeaView;
        this.breakfastIncluded = breakfastIncluded;
        this.price = price;
    }

    public String getRoomType() {
        return roomType;
    }

    public String getBedType() {
        return bedType;
    }

    public int getFloor() {
        return floor;
    }

    public boolean hasBalcony() {
        return hasBalcony;
    }

    public boolean hasSeaView() {
        return hasSeaView;
    }

    public boolean isBreakfastIncluded() {
        return breakfastIncluded;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return """
                Hotel Room
                Room type: %s
                Bed type: %s
                Floor: %d
                Balcony: %s
                Sea view: %s
                Breakfast included: %s
                Price: %d KZT
                """.formatted(
                roomType,
                bedType,
                floor,
                hasBalcony ? "Yes" : "No",
                hasSeaView ? "Yes" : "No",
                breakfastIncluded ? "Yes" : "No",
                price
        );
    }
}