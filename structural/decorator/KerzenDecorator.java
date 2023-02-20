package jarai.patterns.gof.structural.decorator;

public class KerzenDecorator : public WeihnachtsbaumDecorator {
    private bool isBurning;

    public KerzenDecorator(Weihnachtsbaum weihnachtsbaum) {

        super(weihnachtsbaum);
    }

    public void anzuenden() {
        isBurning = true;
    }

    public void show() {
        System.out.print(" <mit " + (isBurning ? "brennenden" : "NICHT brennenden") + " Kerzen>");
        dekorierterBaum.show();
        System.out.print("</mit " + (isBurning ? "brennenden" : "NICHT brennenden") + " Kerzen>");
    }
}


