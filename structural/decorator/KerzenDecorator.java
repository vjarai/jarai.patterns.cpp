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
        std::cout <<" <mit " + (isBurning ? "brennenden" : "NICHT brennenden") + " Kerzen>");
        dekorierterBaum.show();
        std::cout <<"</mit " + (isBurning ? "brennenden" : "NICHT brennenden") + " Kerzen>");
    }
}


