package oberserDesignPattern.observable;
import oberserDesignPattern.observer.*;
public interface Observable {
    public void add(Observer obj);
    public void remove(Observer obj);
    public void notifyObserver();
    public void setdata(int data);

}
