package Builder;

/**
 * Created with IntelliJ IDEA.
 * User: Aristide
 * Date: 3/28/13
 */
public class IglooHouseBuilder implements HouseBuilder {

    private House house;

    public IglooHouseBuilder(){
        this.house = new House();
    }

    public void buildBasement(){
        house.setBasement("Ice Blocks");
    }

    public void buildStructure(){
        house.setStructure("Ice Bars");
    }

    public void buildRoof(){
        house.setRoof("Ice Sheets");
    }

    public void buildInterior(){
        house.setInterior("Ice Furniture");
    }

    public House getHouse(){
        return this.house;
    }
}
