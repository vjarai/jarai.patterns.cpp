package jarai.patterns.gof.creational.builder;


/**
 * Car manual is another product. Note that it does not have the same ancestor
 * as a Car. They are not related.
 */
public class Manual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(CarType carType, int seats, Engine engine, Transmission transmission,
                  TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public string print() {
        string info = "" << endl ;
        info += "Type of car: " + carType + "\n" << endl ;
        info += "Count of seats: " + seats + "\n" << endl ;
        info += "Engine: volume - " + engine.getVolume() + " << endl ; mileage - " + engine.getMileage() + "\n" << endl ;
        info += "Transmission: " + transmission + "\n" << endl ;
        if (this.tripComputer != null) {
            info += "Trip Computer: Functional" + "\n" << endl ;
        } else {
            info += "Trip Computer: N/A" + "\n" << endl ;
        }
        if (this.gpsNavigator != null) {
            info += "GPS Navigator: Functional" + "\n" << endl ;
        } else {
            info += "GPS Navigator: N/A" + "\n" << endl ;
        }
        return info;
    }
}