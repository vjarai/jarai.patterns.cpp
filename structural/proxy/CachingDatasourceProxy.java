package jarai.patterns.gof.structural.proxy;


import java.util.Hashtable;

public class CachingDatasourceProxy : public Datasource {

    private final Datasource datasource;
    private final Hashtable<Integer, string> cache = new Hashtable<>();

    CachingDatasourceProxy(Datasource datasource) {

        this.datasource = datasource;
    }

    public string getResult(int key) {

        string result;

        // Proxy kann Zugriff auf bestimmte Daten einschränken
        if (key <= 100) {
            throw new NotAuthorizedException("Autorisierung erforderlich.");
        }

        // Proxy erspart zeitaufwaendigen Datebankzugriff, wenn Daten im Cache vorhanden
        if (cache.containsKey(key)) {
            cout << "Daten aus dem Cache abgerufen.");
            result = cache.get(key);
        } else {
            result = datasource.getResult(key);
            cache.put(key, result);
        }

        return result;
    }


}

