import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom("Evergreen Suite", "Party", 50);
        guest = new Guest("Fernando");
    }

    @Test
    public void hasARoomName(){
        assertEquals("Evergreen Suite", conferenceRoom.getName());
    }

    @Test
    public void canBeAssignedAFunction() {
        assertEquals("Party", conferenceRoom.getFunction());
    }

    @Test
    public void hasACapacityOf50() {
        assertEquals(50, conferenceRoom.getCapacity());
    }

    @Test
    public void roomGuestListStartsEmpty() {
        assertEquals(0, conferenceRoom.getGuestListSize());
    }

    @Test
    public void canAddGuestToGuestList(){
        conferenceRoom.addGuestToGuestList(guest);
        assertEquals(1, conferenceRoom.getGuestListSize());
    }

    @Test
    public void canRemoveGuestFromGuestList() {
        conferenceRoom.addGuestToGuestList(guest);
        conferenceRoom.removeGuestFromGuestList(guest);
        assertEquals(0, conferenceRoom.getGuestListSize());
    }

}
