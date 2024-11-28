public interface RequestHandler {
    public void handleRequest(Request request);
    public void setNextHandler(RequestHandler requestHandler);
}
