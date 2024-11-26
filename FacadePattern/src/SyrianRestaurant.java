public class SyrianRestaurant implements Restaurant{
    private final Menu menu = new SyrianRestaurantMenu();
    @Override
    public void getMenu() {
        System.out.println("Here is the menu of the Syrian Restaurant: ");
        this.menu.getLunch();
        this.menu.getDessert();
        System.out.println("--------------------------");
    }
}
