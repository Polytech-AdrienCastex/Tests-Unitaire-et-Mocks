
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;
import persons.IPerson;


public class OutilsPerson
{
    
    public IPerson[] getPersonsBetweenAges(IPerson[] persons, GregorianCalendar date, int ageMin, int ageMax) throws IllegalArgumentException
    {
        return getPersonsBetweenAges(Arrays.asList(persons), date, ageMin, ageMax);
    }
    public IPerson[] getPersonsBetweenAges(List<IPerson> persons, GregorianCalendar date, int ageMin, int ageMax) throws IllegalArgumentException
    {
        if(ageMin > ageMax)
            throw new IllegalArgumentException();
        
        return persons.stream()
                .filter(p -> p.getAge(date) >= ageMin && p.getAge(date) <= ageMax)
                .toArray(IPerson[]::new);
    }
    
    
    
    public int rechercheAgeMax(IPerson[] persons, GregorianCalendar date)
    {
        return rechercheAgeMax(Arrays.asList(persons), date);
    }
    public int rechercheAgeMax(List<IPerson> persons, GregorianCalendar date)
    {
        return persons.stream()
                .mapToInt(p -> p.getAge(date))
                .max()
                .getAsInt();
    }
}
