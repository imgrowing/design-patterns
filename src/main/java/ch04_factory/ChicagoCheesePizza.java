package ch04_factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ChicagoCheesePizza extends Pizza {

    public ChicagoCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozarella Cheese");
    }

    @Override
    public void cut() {
        log.info("Cutting the pizza into square slices");
    }
}
