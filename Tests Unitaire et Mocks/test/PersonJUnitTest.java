import java.util.GregorianCalendar;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import persons.IPerson;
import persons.Person;
import java.lang.IllegalArgumentException;

/**
 *
 * @author p1002239
 */
public class PersonJUnitTest
{
    public PersonJUnitTest()
    {
    }
    
    protected IPerson person;
    
    @BeforeClass
    public static void setUpClass()
    { }
    
    @AfterClass
    public static void tearDownClass()
    { }
    
    @Before
    public void setUp()
    {
        person = new Person("bobo", "choco", 2000, 10, 17);
    }
    
    @After
    public void tearDown()
    { }

    @Test
    public void getAge()
    {
        assertEquals(1, person.getAge(new GregorianCalendar(2001, 9, 17)));
        assertEquals(0, person.getAge(new GregorianCalendar(2001, 9, 16)));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void getAgeException()
    {
        person.getAge(new GregorianCalendar(2000, 9, 16));
    }
    
    @Test
    public void wasBorn()
    {
        assertEquals(false, person.wasBorn(new GregorianCalendar(2000, 9, 16)));
        assertEquals(true, person.wasBorn(new GregorianCalendar(2000, 9, 17)));
    }
}
