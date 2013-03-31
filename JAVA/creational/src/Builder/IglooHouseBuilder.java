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

    @Override
    public void buildBasement(){
        house.setBasement("Ice Blocks");
    }

    @Override
    public void buildStructure(){
        house.setStructure("Ice Bars");
    }

    @Override
    public void buildRoof(){
        house.setRoof("Ice Sheets");
    }

    @Override
    public void buildInterior(){
        house.setInterior("Ice Furniture");
    }

    @Override
    public House getHouse(){
        return this.house;
    }
}
