//power of a number
public class d7 {

    public static int power(int n,int p)
    {
        if(p==0)
        {
            return 1;
        }
        return power(n, p-1)*n;
    }
    public static void main(String[] args) {
        int result = power(2,5);
        System.out.println(result);
    }
}
