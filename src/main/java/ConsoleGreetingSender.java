public class ConsoleGreetingSender implements GreetingSender {
    @Override
    public void sendGreetingTo(Contact contact) {
        System.out.printf("To: %s\n" +
                "Subject: Happy birthday!\n" +
                "\n" +
                "Body:\n" +
                "Happy birthday, dear %s!", contact.email, contact.firstName);
    }
}
