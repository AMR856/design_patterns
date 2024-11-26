public class ImageProxy implements Image{
    private String filename = null;
    private RealImage image = null;
    public ImageProxy(String filename){
        this.filename = filename;
    }
    @Override
    public void display() {
        if (this.image == null) this.image = new RealImage(this.filename);
        this.image.display();
    }
}
