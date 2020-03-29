import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void before(){
        plane = new Plane(PlaneType.PRIVATEPLANE);
        flight = new Flight(plane, 7604, "Paris", "Edinburgh", "14h05");
        passenger1 = new Passenger("GG", 2);
        passenger2 = new Passenger("Nats", 1);
        passenger3 = new Passenger("Harvey", 0);
    }

    @Test
    public void hasFlightNumber(){
        assertEquals(7604, flight.getFlightNo());
    }
}
