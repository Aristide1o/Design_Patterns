package Builder;

/**
 * Created with IntelliJ IDEA.
 * User: Aristide
 * Date: 3/28/13
 */
public interface HouseBuilder {

    public void buildBasement();

    public void buildStructure();

    public void buildRoof();

    public void buildInterior();

    public House getHouse();
}
