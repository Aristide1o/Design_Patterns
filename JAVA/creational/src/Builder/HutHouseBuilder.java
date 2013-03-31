package Builder;

/**
 * Created with IntelliJ IDEA.
 * User: Aristide
 * Date: 3/28/13
 */
public class HutHouseBuilder implements HouseBuilder {

    private House house;

    public HutHouseBuilder(){
        this.house = new House();
    }

    @Override
    public void buildBasement(){
        house.setBasement("Stones");
    }

    @Override
    public void buildStructure(){
        house.setStructure("Wood Beams");
    }

    @Override
    public void buildRoof(){
        house.setRoof("Weeds");
    }

    @Override
    public void buildInterior(){
        house.setInterior("Nothing");
    }

    @Override
    public House getHouse(){
        return this.house;
    }
}
