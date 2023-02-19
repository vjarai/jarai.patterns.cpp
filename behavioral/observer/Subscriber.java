package jarai.patterns.gof.behavioral.observer;


import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Subscriber implements PropertyChangeListener {


    public void propertyChange(PropertyChangeEvent evt) {

        cout << evt.getPropertyName() + " Property changed from '" + evt.getOldValue() + "' to '" + evt.getNewValue() + "'.");
    }


}

