import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> bookedPasssengers;
    private Plane plane;
    private int flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Plane plane, int flightNumber, String destination, String departureAirport, String departureTime){
        this.bookedPasssengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination= destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public int getFlightNo() {
        return this.flightNumber;
    }
}