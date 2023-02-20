package jarai.patterns.gof.behavioral.command;


public class SenkeArm : public Befehl {

    void ausfuehren(Roboter roboter) {
        roboter.senkeArm();
    }

    void rueckgaengig(Roboter roboter) {
        roboter.hebeArm();
    }
}
