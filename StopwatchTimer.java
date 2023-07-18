 import java.util.Scanner;

public class StopwatchTimer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Stopwatch and Timer Program");
        System.out.println("===========================");
        System.out.println("1. Stopwatch");
        System.out.println("2. Timer");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            stopwatch();
        } else if (choice == 2) {
            System.out.print("Enter the duration in seconds: ");
            int duration = scanner.nextInt();
            timer(duration);
        } else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }

    public static void stopwatch() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Stopwatch");
        System.out.println("---------");
        System.out.println("Press Enter to start the stopwatch...");
        scanner.nextLine();

        long startTime = System.currentTimeMillis();

        System.out.println("Stopwatch is running. Press Enter to stop...");
        scanner.nextLine();

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        System.out.println("Elapsed Time: " + formatTime(elapsedTime) + " seconds");

        scanner.close();
    }

    public static void timer(int duration) {
        System.out.println("Timer");
        System.out.println("-----");
        System.out.println("Timer started for " + duration + " seconds.");

        long startTime = System.currentTimeMillis();
        long endTime = startTime + (duration * 1000);

        while (System.currentTimeMillis() < endTime) {
            // Wait for the timer to complete
        }

        System.out.println("Timer completed!");

    }

    public static String formatTime(long timeInMillis) {
        long seconds = timeInMillis / 1000;
        return Long.toString(seconds);
    }
}
 
    

