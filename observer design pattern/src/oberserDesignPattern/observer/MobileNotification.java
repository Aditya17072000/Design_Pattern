package oberserDesignPattern.observer;

import oberserDesignPattern.observable.Observable;

public class MobileNotification implements Observer {
    String mobileNumber;
    Observable observable;

    public MobileNotification(String mobileNumber, Observable observable) {
        this.mobileNumber = mobileNumber;
        this.observable = observable;
    }

    public void updateObserver() {
        sendmsg(mobileNumber, "Sale is Live");
    }
    private void sendmsg(String mobileNumber, String msg){
        System.out.println("Message sent to :"+ mobileNumber);
    }

}
