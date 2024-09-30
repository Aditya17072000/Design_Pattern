package oberserDesignPattern.observable;
import oberserDesignPattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableImple implements Observable {
    public List<Observer> observerList = new ArrayList<>();
    public int stock = 0;
    public void add(Observer obj){
        observerList.add(obj);
    }
    public void remove(Observer obj){
        observerList.remove(obj);
    }

    @Override
    public void notifyObserver() {
        for(Observer var : observerList) {
            var.updateObserver();
        }
    }

    @Override
    public void setdata(int data) {
        if(stock == 0){
            notifyObserver();
        }
        stock = data;
    }
}
