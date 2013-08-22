package Command;

/**
 * Created with IntelliJ IDEA.
 * User: Aristide
 * Date: 8/6/13
 *
 * Concrete Receiver
 */
public class Raisin implements RESTResource {

    @Override
    public void get() {
        System.out.println("GET: I'm a raisin");
    }

    @Override
    public void delete() {
        System.out.println("DELETE: I'm a deleted raisin :/");
    }
}
