import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Plane plane;

    @Before
    public void setUp(){
        plane = new Plane(PlaneType.BOEING747,524,10000.00);
    }

    @Test
    public void hasPlane(){
        assertEquals(PlaneType.BOEING747,plane.getType());
    }


}