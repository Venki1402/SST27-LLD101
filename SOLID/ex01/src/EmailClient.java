public class EmailClient extends MessageClient {

    @Override
    void send(String to, String body) {
        System.out.println("[EMAIL to=" + to + "] " + body);
    }
}