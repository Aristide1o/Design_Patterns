package Abstract_Factory;

/**
 * Created with IntelliJ IDEA.
 * User: Aristide
 * Date: 4/5/13
 */
public class Wonderland {
    public Wonderland(AnimalFactory factory){
        Animal animal = factory.createAnimal();
        animal.breathe();
    }
}
