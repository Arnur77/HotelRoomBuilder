package Hotel;

public class LuxuryRoomBuilder implements HotelRoomBuilder {

    private String roomType;
    private String bedType;
    private int floor;
    private boolean hasBalcony;
    private boolean hasSeaView;
    private boolean breakfastIncluded;
    private int price;

    @Override
    public HotelRoomBuilder setRoomType(String roomType) {
        this.roomType = roomType;
        return this;
    }

    @Override
    public HotelRoomBuilder setBedType(String bedType) {
        this.bedType = bedType;
        return this;
    }

    @Override
    public HotelRoomBuilder setFloor(int floor) {
        this.floor = floor;
        return this;
    }

    @Override
    public HotelRoomBuilder setBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
        return this;
    }

    @Override
    public HotelRoomBuilder setSeaView(boolean hasSeaView) {
        this.hasSeaView = hasSeaView;
        return this;
    }

    @Override
    public HotelRoomBuilder setBreakfast(boolean breakfastIncluded) {
        this.breakfastIncluded = breakfastIncluded;
        return this;
    }

    @Override
    public HotelRoomBuilder setPrice(int price) {
        this.price = price;
        return this;
    }

    @Override
    public HotelRoom build() {
        if (roomType == null || bedType == null) {
            throw new IllegalStateException(
                    "Room type and bed type are required"
            );
        }

        if (floor <= 0) {
            throw new IllegalStateException(
                    "Floor must be greater than 0"
            );
        }

        if (price <= 0) {
            throw new IllegalStateException(
                    "Price must be greater than 0"
            );
        }

        return new HotelRoom(
                roomType,
                bedType,
                floor,
                hasBalcony,
                hasSeaView,
                breakfastIncluded,
                price
        );
    }
}