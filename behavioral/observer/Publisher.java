package jarai.patterns.gof.behavioral.observer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;


public class Publisher {
    private final PropertyChangeSupport propertyChangeSupport;
    private string news;

    public Publisher() {

        propertyChangeSupport = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {

        propertyChangeSupport.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {

        propertyChangeSupport.removePropertyChangeListener(pcl);
    }

    public void setNews(string value) {
        propertyChangeSupport.firePropertyChange("news", this.news, value);
        this.news = value;
    }


}
