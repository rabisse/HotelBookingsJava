import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    Bedroom bedroom2;
    ConferenceRoom conferenceRoom;
    Guest guest;
    Booking booking;

    @Before
    public void before() {
        hotel = new Hotel();
        bedroom = new Bedroom(1, RoomType.SINGLE, 20);
        bedroom2 = new Bedroom(2, RoomType.DOUBLE, 40);
        conferenceRoom = new ConferenceRoom("Evergreen Suite", "Party", 50);
        guest = new Guest("Luca");
    }

    @Test
    public void canAddBedroomToHotel() {
        hotel.addBedroomToHotel(bedroom);
        assertEquals(1, hotel.getNumberOfBedrooms());
    }

    @Test
    public void canAddConferenceRoomToHotel() {
        hotel.addConferenceRoomToHotel(conferenceRoom);
        assertEquals(1, hotel.getNumberOfConferenceRooms());
    }

    @Test
    public void canCheckGuestIntoBedroom() {
        hotel.addBedroomToHotel(bedroom);
        hotel.addGuestToRoom(guest, bedroom);
        assertEquals(1, bedroom.getGuestListSize());
    }

    @Test
    public void canCheckGuestIntoConferenceRoom() {
        hotel.addConferenceRoomToHotel(conferenceRoom);
        hotel.addGuestToRoom(guest, conferenceRoom);
        assertEquals(1, conferenceRoom.getGuestListSize());
    }

    @Test
    public void canRemoveAGuestFromConferenceRoom() {
        hotel.addConferenceRoomToHotel(conferenceRoom);
        hotel.addGuestToRoom(guest, conferenceRoom);
        hotel.removeGuestFromRoom(guest, conferenceRoom);
        assertEquals(0, conferenceRoom.getGuestListSize());
    }

    @Test
    public void canRemoveAGuestFromBedroom() {
        hotel.addBedroomToHotel(bedroom);
        hotel.addGuestToRoom(guest, bedroom);
        hotel.removeGuestFromRoom(guest, bedroom);
        assertEquals(0, bedroom.getGuestListSize());
    }

    @Test
    public void bookingsListStartsEmpty() {
        assertEquals(0, hotel.getNumberOfBookings());
    }

    @Test
    public void canAddBookingToBookingsList() {
        this.booking = hotel.createNewBooking(bedroom,5);
        hotel.addBookingToBookings(booking);
        assertEquals(1, hotel.getNumberOfBookings());
    }

    @Test
    public void showVacantRoom() {
        hotel.addBedroomToHotel(bedroom);
        hotel.addBedroomToHotel(bedroom2);
        this.booking = hotel.createNewBooking(bedroom,5);
        hotel.addBookingToBookings(booking);
        assertEquals(bedroom2, hotel.getVacantRooms());
    }

}
