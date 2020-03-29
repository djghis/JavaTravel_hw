import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Eugene", 1);
    }

    @Test
    public void hasName(){
        assertEquals("Eugene", passenger.getName());
    }

    @Test
    public void hasBags(){
        assertEquals(1, passenger.getNumberOfBags());
    }
}
