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

    @Test
    public void hasDestination(){
        assertEquals("Paris", flight.getDestination());
    }

    @Test
    public void hasDepartureAirport(){
        assertEquals("Edinburgh", flight.getDepartureAirport());
    }
    @Test
    public void hasDepartureTime(){
        assertEquals("14h05", flight.getDepartureTime());
    }

    @Test
    public void flightPassengerListStartEmpty(){
        assertEquals(0, flight.getNumbOfPassenger());
    }

    @Test
    public void planeStartEmpty(){
        assertEquals(2, flight.getAvailableSeats());
    }
    @Test
    public void hasAvailableSeats(){
        flight.addPassenger(passenger2);
        assertEquals(1, flight.getAvailableSeats());
    }

    @Test
    public void canAddPassengers(){
        flight.addPassenger(passenger1);
        assertEquals(1, flight.getNumbOfPassenger());
        assertEquals(1, flight.getAvailableSeats());
    }

    @Test
    public void cantAddTooManyPassengers(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        assertEquals(2, flight.getNumbOfPassenger());
        assertEquals(0, flight.getAvailableSeats());

    }
}
