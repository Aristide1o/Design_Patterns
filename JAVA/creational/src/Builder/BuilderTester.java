package Builder;

/**
 * Created with IntelliJ IDEA.
 * User: Aristide
 * Date: 3/28/13
 */
public class BuilderTester {
    public static void main(String[] args){
        HouseBuilder hutBuilder = new HutHouseBuilder();
        CivilEngineer engineer = new CivilEngineer(hutBuilder);

        engineer.constructHouse();

        House house = engineer.getHouse();

        System.out.println("The builder constructed this: " + house.getClass());
    }
}
