package ch06_command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GarageDoor {
    public void up() {
        log.info("UP");
    }

    public void down() {
        log.info("DOWN");
    }

    public void stop() {
        log.info("STOP");
    }

    public void lightOn() {
        log.info("lightOn");
    }

    public void lightOff() {
        log.info("lightOff");
    }
}
