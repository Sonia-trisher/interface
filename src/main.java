public class main {
    public static void main(String[] args) {
        PushNotification pushNotification = new PushNotification();
        pushNotification.sendNotification("Hello sonia");

        NotificationService emailNotification = new EmailNotification();
        emailNotification.sendNotification("Hello queen");

        SmsNotification smsNotification = new SmsNotification();
        smsNotification.sendNotification("Hello hope");

    }
}
