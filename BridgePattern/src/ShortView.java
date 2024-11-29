public class ShortView implements View{
    private Resource resource;
    public ShortView(Resource resource){
        this.resource = resource;
    }
    @Override
    public void show() {
        System.out.println("Short view for the Resource: ");
        System.out.println("Resource Title: " + this.resource.title());
        System.out.println("Resource Image: " + this.resource.image());
        System.out.println("-------------------------");
    }
}
