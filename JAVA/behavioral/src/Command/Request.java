package Command;

/**
 * Created with IntelliJ IDEA.
 * User: Aristide
 * Date: 8/7/13
 *
 * Invoker
 */
public class Request {

    public Request(Command com){
        this.command = com;
    }

    public void send(){
        command.execute();
    }

    private Command command;
}
