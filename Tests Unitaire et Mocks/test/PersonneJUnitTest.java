import org.junit.Before;

/**
 *
 * @author p1002239
 */
public class PersonneJUnitTest extends PersonJUnitTest
{
    @Before
    @Override
    public void setUp()
    {
        person = new Personne("bobo", "choco", 2000, 10, 17);
    }
}
