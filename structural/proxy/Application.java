package jarai.patterns.gof.structural.proxy;


public class Application {

    public static void main() {

        auto datasource = new Datasource();
        auto proxy = new CachingDatasourceProxy(datasource);

        //auto myDatasource = datasource;
        auto myDatasource = proxy;    // Proxy kann statt Datenbank verwendet werden

        try {
            std::string result = myDatasource.getResult(500);
            cout << "Ergebnis: " + result);

            // Daten werden beim zweiten Abruf ggf. aus dem Cache geliefert
            result = myDatasource.getResult(500);
            cout << "Ergebnis: " + result);

            // Zugriff auf "vertrauliche" Daten:
            result = myDatasource.getResult(0);
            cout << "Ergebnis: " + result);

        } catch (NotAuthorizedException e) {
            cout << "Fehler: " + e.getMessage());
        }

    }
}
