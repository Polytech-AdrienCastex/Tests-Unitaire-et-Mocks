import java.security.Timestamp;
import java.time.Instant;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalUnit;
import java.util.Date;
import java.util.GregorianCalendar;
import org.junit.Before;
import people.EfficientPerson;
import people.SimplePerson;

/**
 *
 * @author p1002239
 */
public class SimplePersonJUnitTest extends PersonJUnitTest
{
    @Before
    @Override
    public void setUp()
    {
        person = new SimplePerson("bobo", "choco", 2000, 10, 17);
    }
}
