import java.net.InetAddress;
import java.net.UnknownHostException;

public class qn27 {
    public static void main(String[] args) {
        try {
            // Get the IP address of the local machine
            InetAddress localIP = InetAddress.getLocalHost();
            System.out.println("Local Machine IP Address: " + localIP.getHostAddress());

            // Get the IP address of www.facebook.com
            InetAddress facebookIP = InetAddress.getByName("www.facebook.com");
            System.out.println("IP Address of www.facebook.com: " + facebookIP.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("Unable to resolve host");
            e.printStackTrace();
        }
    }
}
