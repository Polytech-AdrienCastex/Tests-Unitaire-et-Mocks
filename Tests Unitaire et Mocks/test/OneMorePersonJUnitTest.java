import org.junit.Before;
import people.OneMorePerson;
import people.SimplePerson;

/**
 *
 * @author p1002239
 */
public class OneMorePersonJUnitTest extends PersonJUnitTest
{
    @Before
    @Override
    public void setUp()
    {
        person = new OneMorePerson("bobo", "choco", 2000, 10, 17);
    }
}
