class greetings{
    public void go() 
    {
        System.out.println("helllloooo");
    }
}
class India
{
    greetings g=new greetings()
    {
        public void go()
        {
          System.out.println("namaste");
        }
    };
}

public class an{
    public static void main(String[] args) {
        India india = new India();
        india.g.go();
    }
    
}
