package jarai.patterns.gof.behavioral.command;


public class Application {

    public static void main() {

        auto roboter = new Roboter();
        auto makroBefehl = new MakroBefehl();

        makroBefehl.add(new HebeArm());
        makroBefehl.add(new HebeArm());
        makroBefehl.add(new SenkeArm());

        makroBefehl.ausfuehren(roboter);

        makroBefehl.rueckgaengig(roboter);
    }
}
