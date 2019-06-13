package ch01_strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Duck {
	QuackBehavior quackBehavior; // 상위타입으로 변수를 선언
	FlyBehavior flyBehavior;

	public abstract void display();

	public void performQuack() {
		quackBehavior.quack();   // behavior 클래스에 위임
	}

	public void performFly() {
		flyBehavior.fly();       // behavior 클래스에 위임
	}

	public void swim() { // 모든 서브클래스에서 재사용하는 메서드
		log.info("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠");
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
