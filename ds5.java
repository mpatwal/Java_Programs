//sum of digits using recursion
public class ds5 {
    public static void add_digits(int n,int sum){
        //base case
        if(n==0)
        {
            System.out.println(sum);
            return;
        }
        add_digits(n/10,sum+(n%10)); //(n%10)gives last digit 
    }
    public static void main(String[] args) {
        add_digits(2345, 0);
    }
}
