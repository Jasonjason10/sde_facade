package app;

public class FacadeClass {
    Amplifier amp;
    Tuner tuner;
    TheaterLights lights;
    PopcornPopper popper;
    Screen screen;
    Projector projector;
    DvdPlayer dvd;
    CdPlayer cd;


    public FacadeClass() {
        popper = new PopcornPopper("Popcorn popper");
        lights = new TheaterLights("Theater Ceiling Lights");
        amp = new Amplifier("Top-O-Line Amplifier");
        screen = new Screen("Theater Screen");
        projector = new Projector("Top-O-Line Projector", dvd);
        dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
        cd = new CdPlayer("Top-O-Line CD Player", amp);
        tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);

    }

    public void watchMovie() {
        //Prepare for movie
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play("Captain America");

    }

    public void StopMovie() {
        popper.off();
        lights.off();
        screen.up();
        projector.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
        System.out.println("Thanks for Watching!!!!");
    }

    public void startMusic() {
        System.out.println("Enjoy the music!!!!!");
        lights.on();
        amp.on();
        amp.setVolume(5);
        amp.setCd(cd);
        amp.setStereoSound();
        cd.on();
        cd.play("beatles");
    }

    public void StopMusic() {
        amp.off();
        amp.setCd(cd);
        cd.eject();
        cd.off();
        System.out.println("Thanks for Listening!!!");
    }

    public void StartRadio() {
        System.out.println("Enjoy the Radio!!!!!");
        tuner.on();
        tuner.setFrequency(45);
        amp.on();
        amp.setVolume(10);
        amp.setTuner(tuner);
    }

    public void StopRadio() {
        tuner.off();
        amp.off();
        System.out.println("Thanks for Listening to radio!!!!");
    }


}
