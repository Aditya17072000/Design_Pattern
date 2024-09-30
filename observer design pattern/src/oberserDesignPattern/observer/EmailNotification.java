package oberserDesignPattern.observer;

import oberserDesignPattern.observable.Observable;

public class EmailNotification implements Observer {

    String emailId;
    Observable observable;

    public EmailNotification(String emailId, Observable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    public void updateObserver() {
        sendEmail(emailId, "Sale is Live");
    }
    private void sendEmail(String emailId, String msg){
        System.out.println("Message sent to :"+ emailId);
    }
}
