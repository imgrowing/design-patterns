package ch06_command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Light {
    public void on() {
        log.info("Light ON");
    }

    public void off() {
        log.info("Light OFF");
    }
}
