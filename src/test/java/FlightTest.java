import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Plane plane;
    Flight flight;
    Pilot pilot;



    @Before
    public void setUp(){
        plane = new Plane(PlaneType.BOEING747,524,10000.00);
        pilot = new Pilot("Bruce Dickinson","Pilot","IRMA666");
        flight = new Flight(plane,"FL666","Hell", "ABZ", "23.58",pilot);
    }

    @Test
    public void hasPlane(){
        assertEquals(PlaneType.BOEING747,plane.getType());
    }
    @Test
    public void hasFlightNumber(){
        assertEquals("FL666",flight.getFlightNumber());
    }

    @Test
    public void hasDestination(){
        assertEquals("Hell",flight.getDestination());
    }

    @Test
    public void hasDestinationAirport(){
        assertEquals("ABZ", flight.getDestinationAirport());
    }

    @Test
    public void hasDeptTime(){
        assertEquals("23.58",flight.getDeptTime());
    }

    @Test
    public void hasPilot(){
       assertEquals(pilot, flight.getPilot());
    }




}