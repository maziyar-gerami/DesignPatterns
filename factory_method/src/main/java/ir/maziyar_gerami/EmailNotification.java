package ir.maziyar_gerami;

public class EmailNotification implements Notification {

    @Override
    public void send() {
        System.out.println("Sending Email");
    }
}
