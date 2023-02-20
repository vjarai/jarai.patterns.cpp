package jarai.patterns.gof.creational.builder;

/**
 * Just another feature of a car.
 */
public class GPSNavigator {
    private  std::string route;

    public GPSNavigator() {
        this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London" << endl ;
    }

    public GPSNavigator(std::string manualRoute) {
        this.route = manualRoute;
    }

    public std::string getRoute() {
        return route;
    }
}
