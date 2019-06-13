package ch01_strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        log.info("날고 있어요!!");
    }
}
