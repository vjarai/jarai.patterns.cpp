package jarai.patterns.gof.behavioral.command;


public class HebeArm extends Befehl {


    void ausfuehren(Roboter roboter) {
        roboter.hebeArm();
    }

    void rueckgaengig(Roboter roboter) {
        roboter.senkeArm();
    }

}
