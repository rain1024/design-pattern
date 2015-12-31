/**
 * Created by rain on 12/31/2015.
 */
public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObserver(Event event);
}
