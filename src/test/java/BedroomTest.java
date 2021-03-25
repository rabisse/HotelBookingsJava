import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest1;
    Guest guest2;
    Guest guest3;

    @Before
    public void before() {
        bedroom = new Bedroom(10, RoomType.DOUBLE, 20.00);
        guest1 = new Guest("Fernando");
        guest2 = new Guest("Sancho");
        guest3 = new Guest("Anna-Maria");

    }

    @Test
    public void canGetRoomType() {
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void doubleHasValue2() {
        assertEquals(2, bedroom.getValueFromRoomType());
    }

    @Test
    public void hasARoomNumber(){
        assertEquals(10, bedroom.getRoomNumber());
    }

    @Test
    public void roomGuestListStartsEmpty() {
        assertEquals(0, bedroom.getGuestListSize());
    }

    @Test
    public void canAddGuestToGuestList(){
        bedroom.addGuestToGuestList(guest1);
        assertEquals(1, bedroom.getGuestListSize());
    }

    @Test
    public void cantAddGuestIfGuestAtCapacity() {
        bedroom.addGuestToGuestList(guest1);
        bedroom.addGuestToGuestList(guest2);
        bedroom.addGuestToGuestList(guest3);
        assertEquals(2, bedroom.getGuestListSize());
    }


}
