import java.util.Scanner;

class temp{
   void convert()
    {
        int f;
        int c;
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        System.out.println("enter the temperature in celsius");
        c=s.nextInt();
        f= c*9/5 +32;
        System.out.println("the converted temperature is ");
        System.out.println(+f);
        
    }
    
}
public class q10 {
    public static void main(String[] args) {
        temp t =  new temp();
        t.convert();
    }
}
