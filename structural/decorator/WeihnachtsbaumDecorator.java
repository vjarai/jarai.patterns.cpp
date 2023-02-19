package jarai.patterns.gof.structural.decorator;

public abstract class WeihnachtsbaumDecorator extends Weihnachtsbaum {
    protected Weihnachtsbaum dekorierterBaum;

    public WeihnachtsbaumDecorator(Weihnachtsbaum baum) {

        this.dekorierterBaum = baum;
    }

}
