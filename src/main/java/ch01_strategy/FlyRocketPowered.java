package ch01_strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        log.info("로켓 추진으로 날아갑니다");
    }
}
