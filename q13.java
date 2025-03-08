import java.util.*;
import java.lang.*;
@SuppressWarnings("unused")
class u_excep{
    void accept()
    {
        try {
             Scanner s = new Scanner(System.in);
             String name = s.nextLine();
             if (name.length() < 4 ) {
              wrong w = new wrong();
              throw w;  
             }
        } catch (wrong a) {
            System.out.println("not accepted "+a);
            accept();
        }
    }
}
class wrong extends Exception{
    wrong()
    {
        System.out.println("should not be less than 4");
        
    }
}
public class q13 {
    public static void main(String[] args) {
        u_excep u = new u_excep();
        u.accept();
    }
}
