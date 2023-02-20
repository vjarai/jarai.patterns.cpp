package jarai.patterns.gof.behavioral.strategy;


import java.util.ArrayList;

public class Firma {
    private  ArrayList<Arbeiter> _mitarbeiter = new ArrayList<>();
    private  std::string _name;

    public Firma(std::string name) {
        _name = name;
    }


    public void Einstellen(Arbeiter arbeiter) {
        _mitarbeiter.add(arbeiter);
    }

    public void Produzieren() {
        System.out.printf("Firma '%s' produziert:%n", _name);

        for (auto arbeiter : _mitarbeiter)
            arbeiter.Arbeiten();
    }
}

