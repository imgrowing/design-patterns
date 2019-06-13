package ch01_strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MallardDuck extends Duck {
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		log.info("저는 물오리입니다.");
	}
}
