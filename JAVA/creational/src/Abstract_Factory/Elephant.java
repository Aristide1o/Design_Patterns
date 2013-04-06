package Abstract_Factory;

/**
 * Created with IntelliJ IDEA.
 * User: Aristide
 * Date: 4/5/13
 */
public class Elephant implements Animal {
    @Override
    public void breathe() {
        System.out.println("I breathe with my lungs! It's easy!");
    }
}
