package ch04_factory;

public class SimplePizzaFactory {

    Pizza createPizza(String type) {
        Pizza pizza = null;

        // 피자 객체를 생성: 계속 변화하는 부분
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiPizza();
        }
        return pizza;
    }
}