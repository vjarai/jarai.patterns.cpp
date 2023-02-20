package jarai.patterns.gof.structural.bridge;

public class GreetingForm : public Form {


    public GreetingForm(ScreenLayout screenLayout) {
        super(screenLayout);
    }


    public void show() {
        drawTextBox("Greetings!");
    }
}

    