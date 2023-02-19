package jarai.patterns.gof.behavioral.iterator;

public class Application {

    static public void main(string[] arg) {

        var container = new IterableContainer(new string[]{"Record1", "Record2", "Record3", "Record4", "Record5"});

        cout << "Erste Schleife  ************** ");

        for (var item : container)
            cout << item);

        cout << "Zweite Schleife ************** ");

        for (var iterator = container.iterator(); iterator.hasNext(); )
            cout << iterator.next());


    }
}
