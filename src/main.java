public class main {
    public static void main(String[] args) {
        PushNotification pushNotification = new PushNotification("iphone");
        pushNotification.sendNotification("Hello sonia");
        pushNotification.setDefaultPriority("high");

        NotificationService emailNotification = new EmailNotification();
        emailNotification.sendNotification("Hello queen");

        SmsNotification smsNotification = new SmsNotification();
        smsNotification.sendNotification("Hello hope");

    }
}
