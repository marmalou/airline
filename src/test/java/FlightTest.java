import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Passenger passenger;
    PlaneType planeType;
    Flight flight;
    FlightNumber flightNumber;
    Destination destination;
    Departure departure;
    DepartureTime departureTime;

    @Before
    public void setUp(){
        this.passenger = new Passenger("Louise", 2);
        this.planeType = new PlaneType(PlaneType.BOEING747, 100);
        this.flight = new Flight(1);
        this.flightNumber = new FlightNumber(10);
        this.destination = new Destination("Lisbon");
        this.departure = new Departure("Edi");
        this.departureTime = new DepartureTime("12:00");

    }

    @Test
    public void canGetPassengerName(){
        assertEquals("Louise", passenger.getName());
    }

    @Test
    public void hasType(){
        assertEquals( "BOEING747", flight.getPlaneType());
    }

    @Test
    public void canCountCapacity(){
        assertEquals(100, planeType.countCapacity());
    }

    @Test
    public void canAddPassengerToPlane(){
        planeType.addPassenger(passenger);
        assertEquals(1,planeType.countPassengers());
    }
}
