import PizzaDecorator.BasePizza.BasePizza;
import PizzaDecorator.BasePizza.Farmhouse;
import PizzaDecorator.BasePizza.Margherita;
import PizzaDecorator.Toppings.ExtraCheese;
import PizzaDecorator.Toppings.ExtraMushroom;

public class Main {
    public static void main(String[] args) {
        BasePizza basePizza = new Margherita();
        BasePizza basePizza1 = new ExtraCheese(new Margherita());
        BasePizza basePizza2 = new ExtraCheese(new ExtraMushroom(new Farmhouse()));
        int costOfBasePizza = basePizza.totalCost(2);
        int costOfBasePizza1 = basePizza1.totalCost(3);
        int costOfBasePizza2 = basePizza2.totalCost(1);
        System.out.println(costOfBasePizza);
        System.out.println(costOfBasePizza1);
        System.out.println(costOfBasePizza2);
        int bill = costOfBasePizza + costOfBasePizza1 + costOfBasePizza2;
        System.out.println(bill);
}
}