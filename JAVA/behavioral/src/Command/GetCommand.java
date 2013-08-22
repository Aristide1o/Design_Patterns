package Command;

/**
 * Created with IntelliJ IDEA.
 * User: Aristide
 * Date: 8/6/13
 *
 * Concrete Command
 */
public class GetCommand implements Command {

    public GetCommand(RESTResource res){
        this.resource = res;
    }

    @Override
    public void execute(){
        resource.get();
    }

    private RESTResource resource;
}
