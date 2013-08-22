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
        GetCommand getPeanut = new GetCommand(peanut);
        Request getPeanutRequest = new Request(getPeanut);
        getPeanutRequest.send();

        DeleteCommand deletePeanut = new DeleteCommand(peanut);
        Request deletePeanutRequest = new Request(deletePeanut);
        deletePeanutRequest.send();

        Raisin raisin = new Raisin();
        GetCommand getRaisin = new GetCommand(raisin);
        Request getRaisinRequest = new Request(getRaisin);
        getRaisinRequest.send();

        DeleteCommand deleteRaisin = new DeleteCommand(raisin);
        Request deleteRaisinRequest = new Request(deleteRaisin);
        deleteRaisinRequest.send();
    }
}
