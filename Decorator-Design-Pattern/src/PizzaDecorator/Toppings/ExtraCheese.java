package PizzaDecorator.Toppings;

import PizzaDecorator.BasePizza.BasePizza;

public class ExtraCheese extends Toppings{
    BasePizza basePizza;
    int cheese;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
        this.cheese = cheese;
    }

    @Override
    public int totalCost(int number) {
        return this.basePizza.totalCost(number)+20*number;
    }
}
