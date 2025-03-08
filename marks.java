import java.lang.*;
import java.util.Scanner;
@SuppressWarnings("unused")
public class marks {
    public static void main(String[] args) 
    {
        System.out.println("enter your marks:");
        Scanner sc =new Scanner(System.in);
        int x = sc.nextInt();
        if (x>=80 && x<=100) {

            System.out.println("Grade A");
        }
        else if(x>=60 && x<=79)
        {
            System.out.println("grade b");
        } 
        else if (x>=40 && x<=59)
        {
           System.out.println("grade c");
        } 
        else if (x<40) {
           System.out.println("fail");
        }
        
        }
    

    private static void elseif(boolean b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'elseif'");
    }
    }

