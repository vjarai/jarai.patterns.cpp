package jarai.patterns.gof.structural.proxy;


/**
 *
 */
public class Datasource {

    public string getResult(int key) {
        cout << "Datenbankabfrage ausgefuehrt.");
        return "Datensatz " + key;
    }

}
