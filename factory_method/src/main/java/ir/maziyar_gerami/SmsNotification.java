package ir.maziyar_gerami;

public class SmsNotification implements Notification {

    @Override
    public void send() {
        System.out.println("Sending Sms");
    }
}
