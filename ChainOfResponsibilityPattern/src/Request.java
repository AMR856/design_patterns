public class Request {
    private RequestDifficuilty difficulty;

    public Request(RequestDifficuilty difficulty) {
        this.difficulty = difficulty;
    }
    public void changeDifficulty(RequestDifficuilty difficulty){
        this.difficulty = difficulty;
    }
    public RequestDifficuilty getDifficulty(){
        return this.difficulty;
    }
}
