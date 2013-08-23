package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: Aristide
 * Date: 4/5/13
 */
public class Office implements Iterable<Employee> {

    private ArrayList<Employee> team = new ArrayList<Employee>();

    public Office(ArrayList team){
        this.team = team;
    }

    public ArrayList getTeam(){
        return team;
    }

    @Override
    public Iterator<Employee> iterator() {
        return new OfficeIterator(this);
    }
}
