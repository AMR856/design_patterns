//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Request request = new Request(RequestDifficuilty.HARD);
        RequestHandler requestHandlerEasy = new RequestHandlerEasy();
        RequestHandler requestHandlerMedium = new RequestHandlerMedium();
        RequestHandler requestHandlerHard = new RequestHandlerHard();
        requestHandlerEasy.setNextHandler(requestHandlerMedium);
        requestHandlerMedium.setNextHandler(requestHandlerHard);
        requestHandlerHard.setNextHandler(null);
        requestHandlerEasy.handleRequest(request);
    }
}
