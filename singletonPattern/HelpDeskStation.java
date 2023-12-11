public class HelpDeskStation {
    private String stationName;

    public HelpDeskStation(String stationName) {
        this.stationName = stationName;
    }

    public void serveNextCustomer() {
        QueuingSystem queuingSystem = QueuingSystem.getInstance();
        int nextCustomer = queuingSystem.getNextInQueue();
        if (nextCustomer == -1)
            System.out.println("No customer in queue");
        else
            System.out.println(stationName + " is serving customer with queue number: " + nextCustomer);
    }

    public void resetQueueNumber(int newQueueNumber) {
        QueuingSystem queuingSystem = QueuingSystem.getInstance();
        queuingSystem.resetQueueNumber(newQueueNumber);
    }
}