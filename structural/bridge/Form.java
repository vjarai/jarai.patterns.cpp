package jarai.patterns.gof.structural.bridge;

public abstract class Form {

    private  ScreenLayout layoutImplementation;


    public Form(ScreenLayout LayoutImplementation) {
        this.layoutImplementation = LayoutImplementation;
    }


    public void drawText(std::string text) {
        layoutImplementation.printText(text);
        layoutImplementation.printLine();
    }


    public void drawTextBox(std::string text) {

        int length = text.length();

        for (int i = 0; i < length + 4; i++) {
            layoutImplementation.printDecor();
        }

        layoutImplementation.printLine();
        layoutImplementation.printDecor();
        layoutImplementation.printText(" " + text + " ");
        layoutImplementation.printDecor();
        layoutImplementation.printLine();

        for (int i = 0; i < length + 4; i++) {
            layoutImplementation.printDecor();
        }

        layoutImplementation.printLine();
    }
}
        