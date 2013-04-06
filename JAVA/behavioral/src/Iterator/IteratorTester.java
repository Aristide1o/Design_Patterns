package Iterator;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Aristide
 * Date: 4/5/13
 */
public class IteratorTester {
    public static void main(String[] args){
        ArrayList<Employee> employees = new ArrayList();
        employees.add(new Employee("Michael", "Scott"));
        employees.add(new Employee("Dwight", "Schrute"));
        employees.add(new Employee("Jim", "Halpert"));

        Office office = new Office(employees);

        for (Employee employee : office){
            System.out.println(employee.showId());
        }

        System.out.println("\nTest Remove\n");

        OfficeIterator it = (OfficeIterator)office.iterator();
        if (it.hasNext())
            it.next();
        it.remove();

        for (Employee employee : office){
            System.out.println(employee.showId());
        }

    }
}
