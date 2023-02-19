package jarai.patterns.gof.behavioral.command;


public abstract class Befehl {

    abstract void ausfuehren(Roboter meinRoboter);

    abstract void rueckgaengig(Roboter meinRoboter);

}