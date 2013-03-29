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

    public void buildBasement(){
        house.setBasement("Stones");
    }

    public void buildStructure(){
        house.setStructure("Wood Beams");
    }

    public void buildRoof(){
        house.setRoof("Weeds");
    }

    public void buildInterior(){
        house.setInterior("Nothing");
    }

    public House getHouse(){
        return this.house;
    }
}
