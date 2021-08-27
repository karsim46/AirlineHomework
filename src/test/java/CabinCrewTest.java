import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {
    CabinCrew cabinCrew;

    @Before
    public void setUp(){
        cabinCrew = new CabinCrew("Steve Harris", "Co-Pilot");

    }

    @Test
    public void hasName(){
        assertEquals("Steve Harris",cabinCrew.getName());
    }
    @Test
    public void hasRank(){
        assertEquals( "Co-Pilot", cabinCrew.getRank());
    }

}
