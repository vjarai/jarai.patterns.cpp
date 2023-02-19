package jarai.patterns.gof.structural.bridge;

public class GreetingForm extends Form {


    public GreetingForm(ScreenLayout screenLayout) {
        super(screenLayout);
    }


    public void show() {
        drawTextBox("Greetings!");
    }
}

    