public class qn25 {
    public static void main(String[] args) {
        // Extract the main thread
        Thread mainThread = Thread.currentThread();

        // Print initial details of the main thread
        System.out.println("Initial Thread Details:");
        System.out.println("Name: " + mainThread.getName());
        System.out.println("Priority: " + mainThread.getPriority());
        System.out.println("State: " + mainThread.getState());

        // Change the name and priority of the main thread
        mainThread.setName("MyMainThread");
        mainThread.setPriority(Thread.MAX_PRIORITY); // Setting to the highest priority (10)

        // Print updated details of the main thread
        System.out.println("\nUpdated Thread Details:");
        System.out.println("Name: " + mainThread.getName());
        System.out.println("Priority: " + mainThread.getPriority());
        System.out.println("State: " + mainThread.getState());
    }
}
