package PizzaDecorator.BasePizza;

public class VegDelight extends BasePizza {
    @Override
    public int totalCost(int number) {
        return 150*number;
    }
}
