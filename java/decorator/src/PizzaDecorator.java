/**
 * Created by rain on 12/7/2015.
 */

public class PizzaDecorator implements Pizza {
    Pizza pizza;
    public PizzaDecorator(Pizza newPizza) {
        this.pizza = newPizza;
    }

    public String bakePizza() {
        return pizza.bakePizza();
    }

    @Override
    public float getCost() {
        return pizza.getCost();
    }
}