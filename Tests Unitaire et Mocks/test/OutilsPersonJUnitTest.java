
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.stream.Stream;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.BDDMockito;
import static org.mockito.Mockito.*;
import persons.*;
import persons.IPerson;



public class OutilsPersonJUnitTest
{
    public OutilsPersonJUnitTest()
    {
    }
    
    protected OutilsPerson outilsPerson;
    protected IPerson[] persons;
    protected GregorianCalendar gc;
    
    @BeforeClass
    public static void setUpClass()
    { }
    
    @AfterClass
    public static void tearDownClass()
    { }
    
    @Before
    public void setUp()
    {
        outilsPerson = new OutilsPerson();
        
        gc = new GregorianCalendar(2005, 10, 17);
        
        persons = new IPerson[]
        {
            mock(IPerson.class),
            mock(IPerson.class),
            mock(IPerson.class),
            mock(IPerson.class),
            mock(IPerson.class),
            mock(IPerson.class),
            mock(IPerson.class),
            mock(IPerson.class),
            mock(IPerson.class),
            mock(IPerson.class),
            mock(IPerson.class),
            mock(IPerson.class),
            mock(IPerson.class)
        };
        for(int i = 0; i < persons.length; i++)
            when(persons[i].getAge(gc)).thenReturn(i);
    }
    
    @After
    public void tearDown()
    { }

    @Test
    public void getPersonsBetweenAges()
    {
        
        IPerson[] personsExpected = new IPerson[]
        {
            persons[1],
            persons[2],
            persons[3]
        };
        
        assertArrayEquals(outilsPerson.getPersonsBetweenAges(persons, gc, 1, 3),
                personsExpected);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void getPersonsBetweenAgesException()
    {
        outilsPerson.getPersonsBetweenAges(persons, gc, 10, 5);
    }
    
    @Test
    public void rechercheAgeMax()
    {
        assertEquals(outilsPerson.rechercheAgeMax(persons, gc), persons.length - 1);
        
        for(IPerson p : persons)
        {
            verify(p, never()).getFirstName();
            verify(p, never()).getName();
        }
    }
}
