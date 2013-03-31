package Factory_Method;

/**
 * Created with IntelliJ IDEA.
 * User: Aristide
 * Date: 3/31/13
 */
public class FactoryMethodTester {

    public static void main(String[] args){
        // Create the factory
        PersonFactory personFactory = new PersonFactory();

        // Instantiate an object using the factory
        Person person = personFactory.getPerson("Kenyan");

        // I don't know which object the factory made; say something, anything
        System.out.println(person.greet());
    }
}
