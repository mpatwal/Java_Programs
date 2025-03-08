public class k{
    public static void main(String[] args) {
        int[] a={4,2,6,8,1,3,5};
        try{
            System.out.println(a[2]);
        }
        catch(ArrayIndexOutOfBoundsException i)
        {
           System.out.println("array index is out of bound "+a.length);
        }
    }
}