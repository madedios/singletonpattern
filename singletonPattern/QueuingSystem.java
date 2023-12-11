public class QueuingSystem {
    private static QueuingSystem instance;
    private int currentQueueNumber;
    
    private QueuingSystem() {
        this.currentQueueNumber = 1;
    }

    public static synchronized QueuingSystem getInstance() {
        if (instance == null)
            instance = new QueuingSystem();
        return instance;
    }

    public synchronized int getCurrentQueueNumber() {
        return currentQueueNumber;
    }

    private synchronized void generateNextQueueNumber() {
        currentQueueNumber++;
    }

    public synchronized void resetQueueNumber(int newQueueNumber) {
        if (newQueueNumber >= 1) {
            currentQueueNumber = newQueueNumber;
            System.out.println("Queue number reset to: " + currentQueueNumber);
        } else {
            System.out.println("Invalid queue number input. Please enter a number greater than or equal to 1.");
        }
    }

    public synchronized void takeQueueNumber() {
        int queueNumber = getCurrentQueueNumber();
        System.out.println("New visitor took queue number: " + queueNumber);
        generateNextQueueNumber();
    }
}