//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NormalCoffee coffee = new NormalCoffee();
        System.out.println(coffee.getDocs());
        System.out.println(coffee.getCost());
        CoffeeDecorator decoratorMilk = new MilkDecorator(coffee);
        CoffeeDecorator decoratorSugar = new SugarDecorator(coffee);
        System.out.println(decoratorMilk.getDocs());
        System.out.println(decoratorMilk.getCost());
        System.out.println(decoratorSugar.getDocs());
        System.out.println(decoratorSugar.getCost());
    }
}