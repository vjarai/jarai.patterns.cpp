package jarai.patterns.gof.structural.decorator;

public class LamettaDecorator : public WeihnachtsbaumDecorator {

    public LamettaDecorator(Weihnachtsbaum weihnachtsbaum) {
        super(weihnachtsbaum);
    }

    public void show() {
        dekorierterBaum.show();
        System.out.print(", mit Lametta");
    }
}
