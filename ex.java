class wrongage extends Exception{
    wrongage()
    {
        System.out.println("invalid age");
    }
}
class u_exp{
    void accept()
    {
        int age;
        try{
            Scanner sc = new Scanner(System.in);
            age=sc.nextInt();
            if (age <18 || age >30)
            {
                wrongage w = new wrongage();
                throw w;
            }
        }
        catch(wrongage a)
        {
            System.out.println("wrong age"+a);
            accept();
        }
    }
}

public class ex {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        u_exp u = new u_exp();
    }
    
}
