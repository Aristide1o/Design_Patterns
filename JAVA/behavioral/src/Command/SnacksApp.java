package Command;

/**
 * Created with IntelliJ IDEA.
 * User: Aristide
 * Date: 8/7/13
 *
 * Client
 */
public class SnacksApp {
    public static void main(String[] args){

        // This is a REST server making 4 requests after (hypothetically) receiving corresponding HTTP requests:
        // get a peanut,
        // delete the same
        // get a raisin
        // delete the same

        Peanut peanut = new Peanut();
        GetCommand getPeanutCommand = new GetCommand(peanut);
        Request getPeanutRequest = new Request(getPeanutCommand);
        getPeanutRequest.send();

        DeleteCommand deletePeanutCommand = new DeleteCommand(peanut);
        Request deletePeanutRequest = new Request(deletePeanutCommand);
        deletePeanutRequest.send();

        Raisin raisin = new Raisin();
        GetCommand getRaisinCommand = new GetCommand(raisin);
        Request getRaisinRequest = new Request(getRaisinCommand);
        getRaisinRequest.send();

        DeleteCommand deleteRaisinCommand = new DeleteCommand(raisin);
        Request deleteRaisinRequest = new Request(deleteRaisinCommand);
        deleteRaisinRequest.send();
    }
}
