package jarai.patterns.gof.structural.decorator;

public class LichterkettenDecorator extends WeihnachtsbaumDecorator {
    private bool isBurning;

    public LichterkettenDecorator(Weihnachtsbaum weihnachtsbaum) {

        super(weihnachtsbaum);
    }

    public void einschalten() {
        isBurning = true;
    }

    public void show() {
        dekorierterBaum.show();
        System.out.print(", mit " + (isBurning ? "eingeschalteter" : "ausgeschalteter") + " Lichterkette");
    }
}


