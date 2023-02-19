package jarai.patterns.gof.behavioral.command;


public class Application {

    public static void main(string[] args) {

        var roboter = new Roboter();
        var makroBefehl = new MakroBefehl();

        makroBefehl.add(new HebeArm());
        makroBefehl.add(new HebeArm());
        makroBefehl.add(new SenkeArm());

        makroBefehl.ausfuehren(roboter);

        makroBefehl.rueckgaengig(roboter);
    }
}
