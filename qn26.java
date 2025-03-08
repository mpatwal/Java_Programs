// Class for child thread that prints numbers from 1 to 50
class NumberThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.print(i + " ");
            try {
                // Adding a small sleep to clearly observe the outputs from both threads
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println("Child Thread Interrupted");
            }
        }
        System.out.println("\nNumber Thread Finished Execution");
    }
}

public class qn26 {
    public static void main(String[] args) {
        // Create an instance of the child thread
        NumberThread numberThread = new NumberThread();

        // Start the child thread
        numberThread.start();

        // Main thread printing letters from A to Z
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
            try {
                // Adding a small sleep to clearly observe the outputs from both threads
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Main Thread Interrupted");
            }
        }
        System.out.println("\nMain Thread Finished Execution");
    }
}
