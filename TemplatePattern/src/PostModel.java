public class PostModel extends DatabaseRecord {
    private String text;
    private final String regex = "^[a-zA-z0-9 ]*$";
    public PostModel(String text){
        this.text= text;
    }
    @Override
    public boolean validate() {
        return this.text.matches(this.regex);
    }
}
