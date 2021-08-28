import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane;


    @Before
    public void setUp(){
        plane = new Plane(PlaneType.BOEING747, 524,10000.00);
    }

    @Test
    public void hasCapacity(){
        assertEquals(524,plane.getCapacity());
    }

    @Test
    public void hasWeight(){
        assertEquals(10000.00, plane.getWeight(),0);
    }
//
    @Test
    public void hasType(){ assertEquals(PlaneType.BOEING747, plane.getType());}

}
//