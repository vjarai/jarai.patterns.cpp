package jarai.patterns.gof.creational.builder;

public class Application {


    public static void main(string[] args) {


        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        var builder = new CarBuilder();
        var director = new Director();
        director.constructSportsCar(builder);
        var car = builder.getResult();


        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.

        cout << "Car built:\n" + car.getCarType());


        var manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        var carManual = manualBuilder.getResult();
        cout << "\nCar manual built:\n" + carManual.print());
    }

}

