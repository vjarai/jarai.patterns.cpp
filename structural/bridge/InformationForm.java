package jarai.patterns.gof.structural.bridge;

import java.util.Date;

public class InformationForm extends Form {


    public InformationForm(ScreenLayout layout) {
        super(layout);
    }


    public void show() {
        Date date = new Date();
        drawTextBox("Current system time: " + date);
    }
}
        