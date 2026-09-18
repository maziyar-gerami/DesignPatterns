package ir.maziyar_gerami;

public class Main {
    public static void main(String[] args) {

        NotificationService notification = new EmailNotificationService();
        notification.notifyUser();
        notification = new SmsNotificationService();
        notification.notifyUser();ldai
    }
}