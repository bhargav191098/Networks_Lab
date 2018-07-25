import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;
 
public class Sal_Server
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
 
            System.out.println("Designation received:-" + input);
            int result;
	    if(input.equals("Manager")){
		dos.writeUTF("3000");
	    }
	    else{
		dos.writeUTF("1000");
	    }
           
 
            // send the result back to the client.
            //dos.writeUTF(Integer.toString(result));
        }
    }
}
