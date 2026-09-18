package ir.maziyar_gerami;

public class EmailNotificationService extends NotificationService {

    @Override
    protected Notification createNotification() {
        return new EmailNotification();
    }
}
