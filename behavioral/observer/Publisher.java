package jarai.patterns.gof.behavioral.observer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;


public class Publisher {
    private  PropertyChangeSupport propertyChangeSupport;
    private std::string news;

    public Publisher() {

        propertyChangeSupport = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {

        propertyChangeSupport.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {

        propertyChangeSupport.removePropertyChangeListener(pcl);
    }

    public void setNews(std::string value) {
        propertyChangeSupport.firePropertyChange("news", this.news, value);
        this.news = value;
    }


}
