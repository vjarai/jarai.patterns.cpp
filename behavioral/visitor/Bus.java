package jarai.patterns.gof.behavioral.visitor;


public class Bus implements IVisitable {

    public void acceptVisitor(Visitor besucher) {

        besucher.visit(this);
    }

}