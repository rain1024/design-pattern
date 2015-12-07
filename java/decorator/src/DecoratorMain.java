/**
 * Created by rain on 12/7/2015.
 */
public class DecoratorMain {
    public static void main(String[] args) {
        Pizza pizza1 = new Pepperoni(new BasicPizza());
        System.out.println(pizza1.bakePizza());
        System.out.println(pizza1.getCost());

        Pizza pizza2 = new Mushroom(new BasicPizza());
        System.out.println(pizza2.bakePizza());
        System.out.println(pizza2.getCost());

        Pizza pizza3 = new Pepperoni(new Mushroom(new BasicPizza()));
        System.out.println(pizza3.bakePizza());
        System.out.println(pizza3.getCost());
    }
}