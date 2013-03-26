/**
 * Created with IntelliJ IDEA.
 * User: Aristide
 * Date: 3/25/13
 */

// Single instance logger implemented using the singleton pattern.
public class SingletonLogger {
    public static SingletonLogger loggerObject;

    // Private constructor
    private SingletonLogger(){

    }

    // Static instantiator
    public static SingletonLogger getInstance(){
        // The Logger instance does not exist, create it
        if (loggerObject == null){
            loggerObject = new SingletonLogger();
            System.out.println("New Logger");
        }
        // The logger instance exists, print a message
        else {
            System.out.println("Logger already exists");
        }

        return loggerObject;
    }
}
