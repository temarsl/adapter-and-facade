package bookF;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PopcornPopper popcornPopper = new PopcornPopper("поп-корн");
        popcornPopper.on();
        popcornPopper.pop();

        TheaterLights theaterLights = new TheaterLights("theater Lights");
        theaterLights.dim(10);

        Screen screen = new Screen("screen");
        screen.down();

        Projector projector = new Projector("projector");
        projector.on();
        projector.wideScreenMode();

        Amplifier amplifier = new Amplifier("amplifier");
        amplifier.on();
        amplifier.setSurroundSound();
        amplifier.setVolume(5);

        CdPlayer cdPlayer = new CdPlayer("cdPlayer",amplifier);
        cdPlayer.on();
        cdPlayer.play("film");


    }
}
