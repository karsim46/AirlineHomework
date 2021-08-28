import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;


    @Before
    public void setUp(){
        pilot = new Pilot("Bruce Dickinson", "Pilot", "IRMA666");
    }


    @Test
    public void hasName() {
        assertEquals("Bruce Dickinson", pilot.getName());
    }
    @Test
    public void hasRank() {
        assertEquals("Pilot", pilot.getRank());
    }
    @Test
    public void hasPilotLicenseNumber(){
        assertEquals("IRMA666", pilot.getPilotLicenseNumber());
    }

//    @Test
//    public void flyPlane(){
//        assertEquals("Lets go from ABZ to hell!", pilot.flyThePlane(flight));
//    }flight

}
