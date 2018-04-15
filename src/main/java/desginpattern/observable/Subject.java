package desginpattern.observable;

/**
 * Created by Chandra.Sarathe on 4/15/2018.
 */
public interface Subject {

    /**
     * register observer
     * @param o
     */
    public void registerObserver(Observer o);

    /**
     * remove observer
     * @param o
     */
    public void removeObserver(Observer o);

    /**
     * notify to all registered observers.
     */
    public void notifyObservers();
}
