public class UserApp {
    public static void main(String[] args) {
        QueuingSystem queuingSystem = QueuingSystem.getInstance();
        HelpDeskStation station1 = new HelpDeskStation("Help Desk 1");
        HelpDeskStation station2 = new HelpDeskStation("Help Desk 2");
        HelpDeskStation station3 = new HelpDeskStation("Help Desk 3");

        queuingSystem.takeQueueNumber();
        queuingSystem.takeQueueNumber();

        station1.serveNextCustomer();
        station2.serveNextCustomer();
        station3.serveNextCustomer();

        station1.resetQueueNumber(10);

        queuingSystem.takeQueueNumber();
        queuingSystem.takeQueueNumber();
    }
}
