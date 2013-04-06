package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: Aristide
 * Date: 4/5/13
 */
public class Office implements Iterable<Employee> {

    private ArrayList<Employee> office = new ArrayList<Employee>();

    public Office(ArrayList office){
        this.office = office;
    }

    public ArrayList getOffice(){
        return office;
    }

    @Override
    public Iterator<Employee> iterator() {
        return new OfficeIterator(this);
    }
}
