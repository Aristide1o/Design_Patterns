package Builder;

/**
 * Created with IntelliJ IDEA.
 * User: Aristide
 * Date: 3/28/13
 */
public class CivilEngineer {

    private HouseBuilder houseBuilder;

    public CivilEngineer(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    public void constructHouse(){
        this.houseBuilder.buildBasement();
        this.houseBuilder.buildStructure();
        this.houseBuilder.buildRoof();
        this.houseBuilder.buildInterior();
    }

    public House getHouse(){
        return this.houseBuilder.getHouse();
    }
}
