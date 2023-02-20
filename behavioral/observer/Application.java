package jarai.patterns.gof.behavioral.observer;


public class Application {

    public static void main() {

        auto publisher = new Publisher();
        auto subscriber = new Subscriber();

        publisher.addPropertyChangeListener(subscriber);

        publisher.setNews("news");

    }
}
