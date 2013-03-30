package Prototype;

/**
 * Created with IntelliJ IDEA.
 * User: Aristide
 * Date: 3/29/13
 */
public class PrototypeTester {
    public static void main(String[] args){

        Employee engineer = new Employee();
        engineer.setName("Watanabe");
        engineer.setDesignation("Architect");

        try {
            Employee engineerII = (Employee) engineer.clone();
            System.out.println(engineerII.getName() + ", " + engineerII.getDesignation());
        }
        catch (CloneNotSupportedException e){
            System.out.println("Cloneable interface should be implemented" + e);
        }

    }
}
