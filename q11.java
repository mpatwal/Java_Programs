import java.util.Scanner;

class che {
    void show() {
        int x;
    
        System.out.println("enter the number");
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        if (x % 2 == 0) {
            System.out.println("number is even");

        } else {
            System.out.println("number is odd");
        }

    }
}

public class q11 {
    public static void main(String[] args) {
        che c = new che();
        c.show();
    }

}
