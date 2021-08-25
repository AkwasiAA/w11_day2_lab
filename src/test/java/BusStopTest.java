import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    Person person;
    BusStop busstop;

    @Before
    public void before(){
        busstop = new BusStop("Ibiza");
        person = new Person();
    }

    @Test
    public void canAddToQueue(){
        busstop.add(person);
        assertEquals(1, busstop.queueSize());
    }

    @Test
    public void canRemoveFromQueue(){
        busstop.add(person);
        busstop.removeFromQueue();
        assertEquals(0, busstop.queueSize());
    }
}
