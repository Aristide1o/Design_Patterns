package Command;

/**
 * Created with IntelliJ IDEA.
 * User: Aristide
 * Date: 8/6/13
 *
 * Concrete Command
 */
public class DeleteCommand implements Command {

    RESTResource resource;

    public DeleteCommand(RESTResource res){
        this.resource = res;
    }

    @Override
    public void execute(){
        resource.delete();
    }
}
