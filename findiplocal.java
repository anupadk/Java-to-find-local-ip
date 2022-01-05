

import java.net.*;


/**
 *
 * @author Anupadk
 */
public class findiplocal {
    public static void main(String[] args)
    {
        try{
            InetAddress me= InetAddress.getLocalHost();
            String dottedQuad =me.getHostAddress();
            System.out.println("My address is :" +dottedQuad);
            
        } catch (UnknownHostException ex){
            System.out.println("Sorry! I cant find my own address.");
        }
    }
    
    
}
