package PizzaDecorator.BasePizza;

public class Margherita extends BasePizza {

    @Override
    public int totalCost(int number) {
        return 100*number;
    }
}
