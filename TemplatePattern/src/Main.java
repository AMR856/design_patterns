
public class Main {
    public static void main(String[] args) {
        DatabaseRecord user1 = new UserModel("Amr Alnas");
        DatabaseRecord post1 = new PostModel("This is a post about Template Pattern");
        user1.save();
        post1.save();
    }
}