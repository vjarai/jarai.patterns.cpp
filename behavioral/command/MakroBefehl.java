package jarai.patterns.gof.behavioral.command;

import java.util.Vector;


public class MakroBefehl extends Befehl {

    private final Vector<Befehl> childBefehle = new Vector<>();

    void ausfuehren(Roboter meinRoboter) {
        for (Befehl befehl : childBefehle) {
            befehl.ausfuehren(meinRoboter);
        }
    }

    void rueckgaengig(Roboter meinRoboter) {
        for (int i = childBefehle.size() - 1; i >= 0; i--) {
            Befehl befehl = childBefehle.get(i);
            befehl.rueckgaengig(meinRoboter);
        }
    }

    void add(Befehl befehl) {
        childBefehle.add(befehl);
    }

}
