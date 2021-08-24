import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;

    @Before
    public void before() {
        bus = new Bus("Ibiza", 3);
        person = new Person();
    }

    @Test
    public void checkBusHasPassengers(){
    assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());

    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person);
        bus.removePassenger(person);
        assertEquals(0,bus.passengerCount());
    }



}