package jarai.patterns.gof.behavioral.strategy;


public abstract class Arbeiter {
    protected string Name;

    public Arbeiter(string name) {
        Name = name;
    }

    public abstract void Arbeiten();
}
