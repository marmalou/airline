

import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private String PlaneType;
    private int FlightNumber;
    private String destination;
    private String departure;
    private String DepartureTime;

    public Flight(String PlaneType, int FlightNumber, String destination,String departure,
                  String DepartureTime) {
        this.passengers = new ArrayList<Passenger>();
        this.PlaneType= PlaneType;
        this.FlightNumber = FlightNumber;
        this.destination = destination;
        this.departure = departure;
        this.DepartureTime = DepartureTime;
    }

    public int countPassengers() {
        return this.passengers.size();
    }

    public int countCapacity(){
        return PlaneType.getValueFromEnum();
    }

    public void addPassenger(Passenger passenger){
        this.passengers.add(passenger);
    }


    public String getPlaneType() {
        return this.PlaneType;
    }
}
