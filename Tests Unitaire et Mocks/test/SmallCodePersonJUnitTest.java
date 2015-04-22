import org.junit.Before;
import people.SmallCodePerson;

/**
 *
 * @author p1002239
 */
public class SmallCodePersonJUnitTest extends PersonJUnitTest
{
    @Before
    @Override
    public void setUp()
    {
        person = new SmallCodePerson("bobo", "choco", 2000, 10, 17);
    }
}
