package jarai.patterns.gof.behavioral.visitor;


public class Lkw implements IVisitable {

    public void acceptVisitor(Visitor besucher) {

        besucher.visit(this);
    }

}