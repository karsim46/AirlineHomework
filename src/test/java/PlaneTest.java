import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane;


    @Before
    public void setUp(){
        plane = new Plane(250);
    }

    @Test
    public void hasCapacity(){
        assertEquals(250,plane.getCapacity());
    }



}
