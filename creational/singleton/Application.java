package jarai.patterns.gof.creational.singleton;


public class Application {

    public static void main() {

        auto instance1 = Singleton.getInstance();
        auto instance2 = Singleton.getInstance();

        if (instance1 == instance2) {
            cout << "Everything is fine!");
        } else {
            cout << "Houston, we have a problem!");
        }


    }
}
