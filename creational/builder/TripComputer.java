package jarai.patterns.gof.creational.builder;

/**
 * Just another feature of a car.
 */
public class TripComputer {

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        cout << "Fuel level: " + car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            cout << "Car is started");
        } else {
            cout << "Car isn't started");
        }
    }
}
