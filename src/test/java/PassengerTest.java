import org.junit.Before;
import org.junit.Test;

public class PassengerTest {

    Passenger passenger;
    private String Name;
    private int Bags;

    @Before
    public void setUp(){
        passenger = new Passenger(Name, Bags);
    }

}
