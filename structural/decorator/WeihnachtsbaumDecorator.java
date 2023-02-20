package jarai.patterns.gof.structural.decorator;

public abstract class WeihnachtsbaumDecorator : public Weihnachtsbaum {
    protected Weihnachtsbaum dekorierterBaum;

    public WeihnachtsbaumDecorator(Weihnachtsbaum baum) {

        this.dekorierterBaum = baum;
    }

}
