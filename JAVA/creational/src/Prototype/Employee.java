package Prototype;

/**
 * Created with IntelliJ IDEA.
 * User: Aristide
 * Date: 3/29/13
 */
public class Employee implements Cloneable {

    private String name;
    private String designation;

    public Employee(){
        this.setDesignation("Programmer");
    }

    public String getDesignation(){
        return this.designation;
    }

    public void setDesignation(String designation){
        this.designation = designation;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException{
        /*
        Employee copyObj = new Employee();
        copyObj.setDesignation(this.designation);
        copyObj.setName(this.name);
        return copyObj;
         */
        return super.clone();
    }
}
