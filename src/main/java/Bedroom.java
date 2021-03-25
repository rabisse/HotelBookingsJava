public class Bedroom extends Room {

    private int roomNumber;
    private RoomType roomType;
    private double nightlyRate;

    public Bedroom(int roomNumber, RoomType roomType, double nightlyRate) {
        super(roomType.getValue());
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.nightlyRate = nightlyRate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public int getValueFromRoomType() {
        return this.roomType.getValue();
    }

    public double getNightlyRate() {
        return this.nightlyRate;
    }

}
