package ch01_strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        log.info("저는 모형 오리입니다");
    }
}
