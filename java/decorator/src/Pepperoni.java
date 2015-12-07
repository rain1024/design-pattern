/**
 * Created by rain on 12/7/2015.
 */
public class Pepperoni extends PizzaDecorator {
    public Pepperoni(Pizza newPizza) {
        super(newPizza);
    }

    @Override
    public String bakePizza() {
        return super.bakePizza() + " with Pepperoni Toppings";
    }

    @Override
    public float getCost() {
        return super.getCost() + 110;
    }
}
