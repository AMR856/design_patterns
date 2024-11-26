public class RestaurantHelper {
    private final EgyptianRestaurant egyptianRestaurant = new EgyptianRestaurant();
    private final SyrianRestaurant syrianRestaurant = new SyrianRestaurant();
    public void getEgyptianMenu(){
        this.egyptianRestaurant.getMenu();
    }
    public void getSyrianMenu(){
        this.syrianRestaurant.getMenu();
    }
}
