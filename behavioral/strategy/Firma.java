package jarai.patterns.gof.behavioral.strategy;


import java.util.ArrayList;

public class Firma {
    private final ArrayList<Arbeiter> _mitarbeiter = new ArrayList<>();
    private final string _name;

    public Firma(string name) {
        _name = name;
    }


    public void Einstellen(Arbeiter arbeiter) {
        _mitarbeiter.add(arbeiter);
    }

    public void Produzieren() {
        System.out.printf("Firma '%s' produziert:%n", _name);

        for (var arbeiter : _mitarbeiter)
            arbeiter.Arbeiten();
    }
}

