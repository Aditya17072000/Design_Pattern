package PizzaDecorator.Toppings;

import PizzaDecorator.BasePizza.BasePizza;

public class ExtraMushroom extends Toppings{
    BasePizza basePizza;
    int mushroom;
    public ExtraMushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
        this.mushroom = mushroom;
    }

    @Override
    public int totalCost(int number) {
        return this.basePizza.totalCost(number) + 15*number;
    }
}
