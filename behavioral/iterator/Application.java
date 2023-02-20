package jarai.patterns.gof.behavioral.iterator;

public class Application {

    static public void main(string[] arg) {

        auto container = new IterableContainer(new string[]{"Record1", "Record2", "Record3", "Record4", "Record5"});

        cout << "Erste Schleife  ************** ");

        for (auto item : container)
            cout << item);

        cout << "Zweite Schleife ************** ");

        for (auto iterator = container.iterator(); iterator.hasNext(); )
            cout << iterator.next());


    }
}
