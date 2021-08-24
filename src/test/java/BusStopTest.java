import org.junit.Before;

public class BusStopTest {

    Bus bus;
    Person person;
    BusStop busstop;

    @Before
    public void before(){
        bus = new Bus("Ibiza", 3);
        person = new Person();
        busstop = new BusStop("London")
    }
}
