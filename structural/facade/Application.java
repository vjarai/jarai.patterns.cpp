package jarai.patterns.gof.structural.facade;

public class Application {

    public static void main() {

        auto amp = new Amplifier("Top-O-Line Amplifier");
        auto tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
        auto dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
        auto cd = new CdPlayer("Top-O-Line CD Player", amp);
        auto projector = new Projector("Top-O-Line Projector", dvd);
        auto lights = new TheaterLights("Theater Ceiling Lights");
        auto screen = new Screen("Theater Screen");
        auto popper = new PopcornPopper("Popcorn Popper");

        auto homeTheater =
                new HomeTheaterFacade(amp, tuner, dvd, cd,
                        projector, screen, lights, popper);

        homeTheater.WatchMovie("Raiders of the Lost Ark");
        homeTheater.EndMovie();
    }
}
