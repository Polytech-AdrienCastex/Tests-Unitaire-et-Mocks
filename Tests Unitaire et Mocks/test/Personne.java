
import java.util.GregorianCalendar;
import persons.IPerson;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author p1002239
 */
public class Personne extends people.Personne implements IPerson
{
    public Personne(String nom, String prenom, int annee, int mois, int jour)
    {
        super(nom, prenom, annee, mois, jour);
    }

    @Override
    public boolean wasBorn(GregorianCalendar date)
    {
        try
        {
            super.getAge(date);
            return true;
        }
        catch(Exception ex)
        {
            return false;
        }
    }
}
