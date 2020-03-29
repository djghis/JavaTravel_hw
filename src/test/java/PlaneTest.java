import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void setUp(){
        plane = new Plane(PlaneType.BOEING737);
    }

    @Test
    public void hasCapcity(){
        assertEquals(250, plane.getCapacity());
    }
    @Test
    public void hasMaxWeight(){
        assertEquals(80000, plane.getMaxWeight());
    }
}
