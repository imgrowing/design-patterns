package ch01_strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        log.info("저는 못 날아요");
    }
}
