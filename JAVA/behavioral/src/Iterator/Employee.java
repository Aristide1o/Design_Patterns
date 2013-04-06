package Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: Aristide
 * Date: 4/5/13
 */
public class Employee {
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String showId(){
        return firstName + " " + lastName;
    }
}
