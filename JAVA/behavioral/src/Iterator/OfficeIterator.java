package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: Aristide
 * Date: 4/5/13
 */
public class OfficeIterator<Employee> implements Iterator<Object> {

    private ArrayList<?> team;
    private int position;

    public OfficeIterator(Office officeBase){
        this.team = officeBase.getTeam();
    }

    @Override
    public boolean hasNext() {
        return position < team.size();
    }

    @Override
    public Object next() {
        Object employeeObj = team.get(position);
        position++;
        return employeeObj;
    }

    @Override
    public void remove() {
        team.remove(position);
    }
}
