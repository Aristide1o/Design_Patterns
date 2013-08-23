package Factory_Method;

/**
 * Created with IntelliJ IDEA.
 * User: Aristide
 * Date: 3/31/13
 */
public class PersonFactory {

    public Person getPerson(String personNationality){
        Person person = null;

        // Based on input, instantiate a Person object.
        if ("Kenyan".equals(personNationality) || "Tanzanian".equals(personNationality))
            person = new Mswahili();
        else if ("Irish".equals(personNationality) || "Scottish".equals(personNationality))
            person = new Englishman();

        return person;
    }
}
