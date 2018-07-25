import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.lang.*;
import java.io.*;
import java.util.*;

 
public class Str_Server
{
    public static void main(String args[]) throws IOException
    {
 
        // Step 1: Establish the socket connection.
        ServerSocket ss = new ServerSocket(3000);
        Socket s = ss.accept();
 
        // Step 2: Processing the request.
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
 
        while (true)
        {
            // wait for input
            String input = dis.readUTF();
 
            if(input.equals("bye"))
                break;
 
            System.out.println("IP received:-" + input);
            int result;
	    int i=0;
	    String ip[]={"165.165.80.80","165.165.79.1"};
	    String mac[]={"6A:08:AA:C2","8A:BC:E3:FA"};
	    for( i=0;i<ip.length;i++){
		if(input.equals(ip[i])){
			System.out.println("Found MAC. Sending the MAC Address...");
			dos.writeUTF(mac[i]+'\n');
			break;
				
		}
	    }	

           
 
            // send the result back to the client.
            //dos.writeUTF(Integer.toString(result));
        }
    }
}
