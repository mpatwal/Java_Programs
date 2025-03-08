//reverse the name
public class ds4 {
    public static void print(String name,int count) {
        //base case
        if (count==0) {
            return;
        }
        //samll pproblem
        print(name,--count);
        System.out.println(name);  
    }
    public static void main(String[] args) {
        print("manisha",5 );
    }
}
