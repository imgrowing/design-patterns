package ch04_factory;

import ch04_factory.ingredient.NYPizzaIngredientFactory;
import ch04_factory.ingredient.PizzaIngredientFactory;

public class NYPizzaStoreFromFactory extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiPizza(ingredientFactory);
            pizza.setName("New York Style Veggi Pizza");
        }
        return pizza;
    }
}
