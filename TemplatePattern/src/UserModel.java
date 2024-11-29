public class UserModel extends DatabaseRecord {
    private String username;
    private final String regex = "^[a-zA-Z ]+$";
    public UserModel(String username){
        this.username = username;
    }
    @Override
    public boolean validate() {
        return this.username.matches(this.regex);
    }
    @Override
    public void beforeSave(){
        System.out.println("Checking before saving the user");
    }
}
