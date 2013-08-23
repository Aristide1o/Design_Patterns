package Command;

/**
 * Created with IntelliJ IDEA.
 * User: Aristide
 * Date: 8/7/13
 *
 * Invoker
 */
public class Request {

    private Command command;

    public Request(Command com){
        this.command = com;
    }

    public void send(){
        command.execute();
    }
}
