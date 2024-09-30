package PizzaDecorator.BasePizza;

public class Farmhouse extends BasePizza {

    @Override
    public int totalCost(int number) {
        return 200*number;
    }
}
