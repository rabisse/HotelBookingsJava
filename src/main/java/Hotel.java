import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Booking> bookings;
    private Booking booking;
    private ArrayList<Bedroom> bookedRooms;
    private ArrayList<Bedroom> vacantRooms;

    public Hotel() {
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.bookings = new ArrayList<>();
    }

    public void addBedroomToHotel(Bedroom bedRooms) {
        this.bedrooms.add(bedRooms);
    }

    public void addConferenceRoomToHotel(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public int getNumberOfBedrooms() {
        return this.bedrooms.size();
    }

    public int getNumberOfConferenceRooms() {
        return this.conferenceRooms.size();
    }

//    public int getNumberOfVacantRooms() {
//        return this.vacantRooms.size();
//    }

    public void addGuestToRoom(Guest guest, Room room) {
        room.addGuestToGuestList(guest);
    }

    public void removeGuestFromRoom(Guest guest, Room room) {
        room.removeGuestFromGuestList(guest);
    }

    public int getNumberOfBookings() {
        return this.bookings.size();
    }

//    public void createNewBooking(Bedroom bedroom, int numberOfNights) {
//        bookings.add(new Booking(bedroom, numberOfNights));
//    }

    public Booking createNewBooking(Bedroom bedroom, int numberOfNights) {
        booking = new Booking(bedroom, numberOfNights);
        return booking;
    }

    public void addBookingToBookings(Booking booking) {
        bookings.add(booking);
    }

    public Bedroom getVacantRooms() {
        vacantRooms = bedrooms;
        for (Booking booking : bookings) {
            this.bookedRooms.add(booking.getBedroom());
        }
        vacantRooms.removeAll(bookedRooms);
        return vacantRooms.get(0);
    }




}
