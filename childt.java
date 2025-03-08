/*there are two ways of creating child thread in java
i) using thread class
ii)implementing runnable interface
*/
import java.util.*;
import java.lang.*;
/* 
class childt extends Thread
{
  childt()
  {}
  public void run()
  {
    System.out.println("thread is working ");
  }

    public static void main(String[] args) {

        for(int i=1;i<=5;i++)
        {
        childt c = new childt();
        c.start();
        for(int j =1;j<=10;j++)
        {
            System.out.println(i+"*" +j+"="+(i*j));
        }
        System.out.println("****");
    }
        
    }

}
    */

    class childt implements runnable 
    {
        private Runnable This;
        Thread t = new Thread(This);
        childt()
        {
            t.start();
        }
        public void run(){
            for(int i=0;i<20;i++)
            {
                System.out.println("child thread : "+i);
            }
        }
        public static void main(String[] args) {
            childt t1 = new childt();
            t1.run();
            for(char c='a';c<='z';c++)
            {
                System.out.println("main thread :"+c);
            }
        }
    }