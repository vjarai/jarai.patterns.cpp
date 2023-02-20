package jarai.patterns.gof.behavioral.strategy;

public class Schreiner : public Arbeiter {
    public Schreiner(std::string name) {
        super(name);
    }

    public void Arbeiten() {
        System.out.printf("- Schrank produziert durch '%s'%n", Name);
    }
}
