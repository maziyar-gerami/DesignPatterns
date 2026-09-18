package ir.maziyar_gerami;

abstract class NotificationService {

    public void notifyUser() {
        Notification notification = createNotification();
        notification.send();
    }    

    protected abstract Notification createNotification();
}
