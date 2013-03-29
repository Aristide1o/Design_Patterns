package Singleton;

/**
 * Created with IntelliJ IDEA.
 * User: Aristide
 * Date: 3/25/13
 */

public class SingletonTester {

    public static void main(String[] args){
        SingletonLogger logger = SingletonLogger.getInstance();
        SingletonLogger logger2 = SingletonLogger.getInstance();
        SingletonLogger logger3 = SingletonLogger.getInstance();
    }
}
