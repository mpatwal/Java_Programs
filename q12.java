import java.util.Scanner;
class u_exp{
    void accept()
    {
        
        try {
            Scanner s = new Scanner(System.in);
            int age = s.nextInt();

            if (age <=18 || age >30) {
                invalidage i = new invalidage();
                throw i;
            }
        } catch (invalidage a) {
            System.out.println("wrong age"+a);
            accept();
        }
    }
}
class invalidage extends Exception{
    invalidage()
    {
        System.out.println("invalid age");
    }
}
public class q12 {
    public static void main(String[] args) {
        u_exp u = new u_exp();
        u.accept();
    }
}
