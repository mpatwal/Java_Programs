import java.util.Scanner;

public class qn10 {
    public static boolean isFibonacci(int n) {
        if (n == 0 || n == 1) {
            return true;
        }
        int a = 0;
        int b = 1;
        int c = a + b;
          while (c <= n) {
            if (c == n) {
                return true; // n is part of the Fibonacci series
            }
             a = b;
            b = c;
            c = a + b;
        }
                return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int number = scanner.nextInt();
                if (isFibonacci(number)) {
            System.out.println(number + " is a part of the Fibonacci series.");
        } else {
            System.out.println(number + " is NOT a part of the Fibonacci series.");
        }
      }
}
