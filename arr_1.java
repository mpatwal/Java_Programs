

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
public class arr_1 {
    public static void main(String[] args) {
        int i;
        int[] x = new int[10];
        System.out.println("enter the numbers");
        Scanner s = new Scanner(System.in);
        for( i=0;i<10;i++)
        {
            x[i]=s.nextInt();
        }
        Arrays.sort(x);
        System.out.println("your array in ascending order");
        for(i=0;i<10;i++)
        {
            System.out.println(x[i]);
        }
        //System.out.println("your array in descending order");
       /*Arrays.sort(x).(x,Collections.reverseOrder());
        for(i=0;i<10;i++)
        {
            System.out.println(x[i]);
        }*/
    }
}
