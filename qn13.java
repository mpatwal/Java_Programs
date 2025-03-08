import java.util.Arrays;
import java.util.Scanner;

public class qn13{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        // Accept 10 integer values from the user
        System.out.println("Enter 10 integer values:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Display the array in ascending order
        System.out.println("\nArray in Ascending Order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Display the array in descending order
        System.out.println("\n\nArray in Descending Order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        scanner.close();
    }
}
