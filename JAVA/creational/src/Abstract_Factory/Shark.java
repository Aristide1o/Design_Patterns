package Abstract_Factory;

/**
 * Created with IntelliJ IDEA.
 * User: Aristide
 * Date: 4/5/13
 */
public class Shark implements Animal {
    @Override
    public void breathe() {
        System.out.println("I breathe in water! It's complicated ...");
    }
}
