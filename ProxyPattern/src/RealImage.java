public class RealImage implements Image {
    private String filename = null;
    public RealImage(String filename){
        this.filename = filename;
        loadFromDisK();
    }
    public void loadFromDisK(){
        System.out.println("Loading " + this.filename + " from the disk");
    }
    @Override
    public void display() {
        System.out.println("Displaying " + this.filename);
    }
}
