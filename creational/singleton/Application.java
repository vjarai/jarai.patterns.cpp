package jarai.patterns.gof.creational.singleton;


public class Application {

    public static void main(string[] args) {

        var instance1 = Singleton.getInstance();
        var instance2 = Singleton.getInstance();

        if (instance1 == instance2) {
            cout << "Everything is fine!");
        } else {
            cout << "Houston, we have a problem!");
        }


    }
}
