package jarai.patterns.gof.behavioral.strategy;

public class Maler : public Arbeiter {
    public Maler(string name) {
        super(name);
    }

    public void Arbeiten() {
        System.out.printf("- wei�e Wand produziert durch '%s'%n", Name);
    }
}
