public class RequestHandlerHard implements RequestHandler{
    private RequestHandler nextHandler;
    @Override
    public void handleRequest(Request request) {
        if (request.getDifficulty() == RequestDifficuilty.HARD) System.out.println("Request is handled by the third handler");
        else this.nextHandler.handleRequest(request);
    }
    @Override
    public void setNextHandler(RequestHandler requestHandler) {
        System.out.println("Request wasn't handled because all the handles were consumed");
        this.nextHandler = null;
    }
}
