public class PushNotification implements NotificationService{
    private String deviceId;
    private String defaultPriority;

    public PushNotification(String deviceId) {
        this.deviceId = deviceId;

    }

    @Override
    public void setDefaultPriority(String priority) {
        this.defaultPriority = priority;
        System.out.println("Default priority for PushNotification set to: " + defaultPriority);

    }
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Push Notification to  device Id["+ deviceId +"]:" + message);

    }
}

 class EmailNotification implements NotificationService{
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending mail Notification:" + message);
    }
} class SmsNotification implements NotificationService{
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending sms Notification:" + message);
    }
}