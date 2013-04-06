package Abstract_Factory;

/**
 * Created with IntelliJ IDEA.
 * User: Aristide
 * Date: 4/5/13
 */
public class AbstractFactoryTester {
    public static AnimalFactory createAnimalFactory(String type){
        if ("water".equals(type))
            return new SeaAnimalFactory();
        else
            return new LandAnimalFactory();
    }

    public static void main(String[] args){
        new Wonderland(createAnimalFactory("Whatever"));
        new Wonderland(createAnimalFactory("water"));
    }
}
