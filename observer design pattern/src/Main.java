import oberserDesignPattern.observable.Observable;
import oberserDesignPattern.observable.ObservableImple;
import oberserDesignPattern.observer.EmailNotification;
import oberserDesignPattern.observer.MobileNotification;
import oberserDesignPattern.observer.Observer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Observable observable = new ObservableImple();

        Observer observer1 = new EmailNotification("abc@gmail.com", observable);
        Observer observer2 = new MobileNotification("9876543210", observable);

        observable.add(observer1);
        observable.add(observer2);
        observable.setdata(10);
        observable.setdata(0);
        observable.setdata(100);
    }
}