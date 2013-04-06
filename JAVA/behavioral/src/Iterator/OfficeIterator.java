package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: Aristide
 * Date: 4/5/13
 */
public class OfficeIterator<Employee> implements Iterator<Object> {

    private ArrayList<?> office;
    private int position;

    public OfficeIterator(Office officeBase){
        this.office = officeBase.getOffice();
    }


    @Override
    public boolean hasNext() {
        return position < office.size();
    }

    @Override
    public Object next() {
        Object employeeObj = office.get(position);
        position++;
        return employeeObj;
    }

    @Override
    public void remove() {
        office.remove(position);
    }
}
