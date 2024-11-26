public class EgyptianRestaurant implements Restaurant{
    private final Menu menu = new EgyptianRestaurantMenu();
    @Override
    public void getMenu() {
        System.out.println("Here is the menu of the Egyptian Restaurant: ");
        this.menu.getLunch();
        this.menu.getDessert();
        System.out.println("--------------------------");
    }
}
