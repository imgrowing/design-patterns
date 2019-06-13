package ch01_strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        log.info("<< 조용~ >>");
    }
}
