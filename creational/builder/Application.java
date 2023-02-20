package jarai.patterns.gof.creational.builder;

public class Application {


    public static void main() {


        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        auto builder = new CarBuilder();
        auto director = new Director();
        director.constructSportsCar(builder);
        auto car = builder.getResult();


        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.

        cout << "Car built:\n" + car.getCarType());


        auto manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        auto carManual = manualBuilder.getResult();
        cout << "\nCar manual built:\n" + carManual.print());
    }

}

