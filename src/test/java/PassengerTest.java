import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Axel Rose",  2);
    }
    @Test
    public void passengerHasName(){
        assertEquals("Axel Rose", passenger.getName());
    }

    @Test
    public void passengerHasNumberOfBags(){
        assertEquals(2, passenger.getNumberOfBags());
    }
}
