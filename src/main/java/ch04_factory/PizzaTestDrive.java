package ch04_factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        log.info("Ethan ordered a {}", pizza.getName());

        pizza = chicagoStore.orderPizza("cheese");
        log.info("Joel ordered a {}", pizza.getName());

    }
}
