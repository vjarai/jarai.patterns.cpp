package jarai.patterns.gof.behavioral.visitor;

import java.util.Iterator;
import java.util.Vector;

public class Fuhrpark implements Iterable<IVisitable> {

    public Vector<IVisitable> fahrzeuge = new Vector<IVisitable>();


    public void add(IVisitable fahrzeug) {
        fahrzeuge.add(fahrzeug);
    }

    @Override
    public Iterator<IVisitable> iterator() {
        return fahrzeuge.iterator();
    }

    public void acceptVisitor(Visitor visitor) {
        for (IVisitable fahrzeug : fahrzeuge) {
            fahrzeug.acceptVisitor(visitor);
            //visitor.visit(fahrzeug);
        }

    }
}
