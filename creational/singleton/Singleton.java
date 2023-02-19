package jarai.patterns.gof.creational.singleton;


public class Singleton {

    private static Singleton singleton;

    private Singleton() {


    }


    static Singleton getInstance() {

        if (singleton == null) {
            singleton = new Singleton();
        }

        return singleton;
    }


}
