package ch04_factory;

import ch04_factory.ingredient.PizzaIngredientFactory;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class VeggiPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public VeggiPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        log.info("Preparing {}", getName());
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
    }
}
