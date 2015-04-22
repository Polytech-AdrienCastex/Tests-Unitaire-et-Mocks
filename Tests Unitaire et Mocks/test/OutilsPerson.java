
import java.util.GregorianCalendar;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import persons.IPerson;


public class OutilsPerson
{
    
    public List<IPerson> getPersonsBetweenAges(IPerson[] persons, GregorianCalendar date, int ageMin, int ageMax) throws IllegalArgumentException
    {
        if(ageMin > ageMax)
            throw new IllegalArgumentException();
        
        return Stream.of(persons)
                .filter(p -> p.getAge(date) >= ageMin && p.getAge(date) <= ageMax)
                .collect(Collectors.toList());
    }
}
