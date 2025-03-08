import java.util.Scanner;
public class qn11 {
    public static void printFibonacciSeries(int limit) {
        int a = 0; 
        int b = 1; 
        System.out.print("Fibonacci Series up to " + limit + ": ");        
        System.out.print(a + " " + b + " ");
        int next = a + b;
        while (next <= limit) {
            System.out.print(next + " ");
            a = b;
            b = next;
            next = a + b; }
        System.out.println();     }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit for Fibonacci series: ");
        int limit = scanner.nextInt();
         printFibonacciSeries(limit);
        }
}
