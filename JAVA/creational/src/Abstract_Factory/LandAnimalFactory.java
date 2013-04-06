package Abstract_Factory;

/**
 * Created with IntelliJ IDEA.
 * User: Aristide
 * Date: 4/5/13
 */
public class LandAnimalFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Elephant();
    }
}
