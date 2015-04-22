import java.security.Timestamp;
import java.time.Instant;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalUnit;
import java.util.Date;
import java.util.GregorianCalendar;
import org.junit.Before;
import people.EfficientPerson;

/**
 *
 * @author p1002239
 */
public class EfficientPersonJUnitTest extends PersonJUnitTest
{
    @Before
    @Override
    public void setUp()
    {
        person = new EfficientPerson("bobo", "choco", Instant.now().minusNanos(new GregorianCalendar(2000, 9, 17).getTime().getTime()).get(ChronoField.YEAR));
    }
}
