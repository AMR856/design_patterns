public class RequestHandlerMedium implements RequestHandler{
    private RequestHandler nextHandler;
    @Override
    public void handleRequest(Request request) {
        if (request.getDifficulty() == RequestDifficuilty.MEDIUM) System.out.println("Request is handled by the second handler");
        else this.nextHandler.handleRequest(request);
    }
    @Override
    public void setNextHandler(RequestHandler requestHandler) {
        this.nextHandler = requestHandler;
    }
}

