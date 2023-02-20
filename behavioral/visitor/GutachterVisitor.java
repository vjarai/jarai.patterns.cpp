package jarai.patterns.gof.behavioral.visitor;

public class GutachterVisitor : public Visitor {

    void visit(Lkw e) {

        cout << "Gutachter begutachtet Lkw");
    }

    void visit(Bus e) {

        cout << "Gutachter begutachtet Bus");
    }


}
