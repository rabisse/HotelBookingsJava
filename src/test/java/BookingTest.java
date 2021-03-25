import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Bedroom bedroom;
    private Booking booking;

    @Before
    public void before() {
        bedroom = new Bedroom(10, RoomType.DOUBLE, 20);
        booking = new Booking(bedroom, 3);
    }

    @Test
    public void canGetTotalCostOfStay() {
        assertEquals(60, booking.getTotalCostOfStay(), 0.0);
    }

}
