package jarai.patterns.gof.behavioral.visitor;


public class ReinigungsVisitor : public Visitor {

    void visit(Bus e) {

        cout << "Reinigungskraft staubsaugt den Bus");
    }

    void visit(Lkw e) {

        cout << "Reinigungskraft dampfstrahlt den Lkw");
    }

}