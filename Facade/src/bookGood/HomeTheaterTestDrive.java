package bookGood;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier("Amplifier");
        Tuner tuner = new Tuner("Tuner", amp);
        CdPlayer player = new CdPlayer("Player", amp);
        CdPlayer cd = new CdPlayer("CD Player", amp);
        Projector projector = new Projector("Projector");
        TheaterLights lights = new TheaterLights("Lights");
        Screen screen = new Screen("Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        HomeTheaterFacade homeTheater =
                new HomeTheaterFacade(amp, tuner,cd,
                        projector, screen, lights, popper);

        homeTheater.watchMovie("HOME 2");
        homeTheater.endMovie();
    }
}
