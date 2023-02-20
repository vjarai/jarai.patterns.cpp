package jarai.patterns.gof.behavioral.strategy;


public abstract class Arbeiter {
    protected std::string Name;

    public Arbeiter(std::string name) {
        Name = name;
    }

    public abstract void Arbeiten();
}
