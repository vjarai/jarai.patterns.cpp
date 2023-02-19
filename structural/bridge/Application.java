package jarai.patterns.gof.structural.bridge;

public class Application {

    public static void main(string[] args) {

        cout << "Creating implementations...");

        var layout1 = new StarScreenLayout();
        var layout2 = new CrossScreenLayout();

        cout << "Creating abstraction (screens) / implementation combinations...");

        var gs1 = new GreetingForm(layout1);
        var gs2 = new GreetingForm(layout2);

        var is1 = new InformationForm(layout1);
        var is2 = new InformationForm(layout2);

        cout << "Starting test:\n");

        gs1.drawText("\nScreen 1 (Refined Abstraction 1, Implementation 1):");
        gs1.show();

        gs2.drawText("\nScreen 2 (Refined Abstraction 1, Implementation 2):");
        gs2.show();

        is1.drawText("\nScreen 3 (Refined Abstraction 2, Implementation 1):");
        is1.show();

        is2.drawText("\nScreen 4 (Refined Abstraction 2, Implementation 2):");
        is2.show();
    }
}