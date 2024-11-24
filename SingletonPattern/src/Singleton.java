public class Singleton {
// Eager initialization
//    private static Singleton obj = new Singleton();
    private static Singleton instance;
    private Singleton(){}
//    Lazy initialization
    public static synchronized Singleton getInstance(){
        if (Singleton.instance == null) Singleton.instance = new Singleton();
        return Singleton.instance;
    }
    public void printLol(){
        System.out.println("Lol");
    }
}
