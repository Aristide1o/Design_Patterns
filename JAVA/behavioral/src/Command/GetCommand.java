package Command;

/**
 * Created with IntelliJ IDEA.
 * User: Aristide
 * Date: 8/6/13
 *
 * Concrete Command
 */
public class GetCommand implements Command {

    private RESTResource resource;

    public GetCommand(RESTResource res){
        this.resource = res;
    }

    @Override
    public void execute(){
        resource.get();
    }
}
