package jarai.patterns.gof.behavioral.visitor;

public class Application {
    public static void main() {

        auto fuhrpark = new Fuhrpark();

        fuhrpark.add(new Lkw());
        fuhrpark.add(new Bus());

        auto gutachter = new GutachterVisitor();
        fuhrpark.acceptVisitor(gutachter);

        auto reinigungskraft = new ReinigungsVisitor();
        fuhrpark.acceptVisitor(reinigungskraft);

    }
}

