public class LongView implements View{
    private Resource resource;
    public LongView(Resource resource){
        this.resource = resource;
    }
    @Override
    public void show() {
        System.out.println("Long view for the Resource: ");
        System.out.println("Resource Title: " + this.resource.title());
        System.out.println("Resource URL: " + this.resource.url());
        System.out.println("Resource Description: " + this.resource.snippet());
        System.out.println("Resource Image: " + this.resource.image());
        System.out.println("-------------------------");
    }
}
