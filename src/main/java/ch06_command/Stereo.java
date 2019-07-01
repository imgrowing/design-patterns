package ch06_command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Stereo {
    int volume = 0;

    public void on() {
        log.info("Stereo on");
    }

    public void off() {
        log.info("Stereo off");
    }

    public void setCd() {
        log.info("Stereo cd");
    }

    public void setDvd() {
        log.info("Stereo dvd");
    }

    public void setRadio() {
        log.info("Stereo radio");
    }

    public void setVolume(int volume) {
        log.info("Stereo volume " + volume);
    }
}
