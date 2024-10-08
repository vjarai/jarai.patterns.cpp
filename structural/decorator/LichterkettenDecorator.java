package jarai.patterns.gof.structural.decorator;

public class LichterkettenDecorator : public WeihnachtsbaumDecorator {
    private bool isBurning;

    public LichterkettenDecorator(Weihnachtsbaum weihnachtsbaum) {

        super(weihnachtsbaum);
    }

    public void einschalten() {
        isBurning = true;
    }

    public void show() {
        dekorierterBaum.show();
        std::cout <<", mit " + (isBurning ? "eingeschalteter" : "ausgeschalteter") + " Lichterkette");
    }
}


