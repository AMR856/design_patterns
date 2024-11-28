public class RequestHandlerEasy implements RequestHandler{
    private RequestHandler nextHandler;
    @Override
    public void handleRequest(Request request) {
        if (request.getDifficulty() == RequestDifficuilty.EASY) System.out.println("Request is handled by the first handler");
        else this.nextHandler.handleRequest(request);
    }
    @Override
    public void setNextHandler(RequestHandler requestHandler) {
        this.nextHandler = requestHandler;
    }
}
