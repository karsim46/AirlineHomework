import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Plane plane;
    Flight flight;


    @Before
    public void setUp(){
        plane = new Plane(PlaneType.BOEING747,524,10000.00);
        flight = new Flight(plane,"FL666");
    }

    @Test
    public void hasPlane(){
        assertEquals(PlaneType.BOEING747,plane.getType());
    }
    @Test
    public void hasFlightNumber(){
        assertEquals("FL666",flight.getFlightNumber());
    }



}