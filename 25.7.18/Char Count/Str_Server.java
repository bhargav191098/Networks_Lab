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
 
            System.out.println("String received:-" + input);
            int result;
	    int i=0;
	    int count=0;
	    for(i=0;i<input.length();i++){
		if(!Character.isWhitespace(input.charAt(i)))
			count++;
	    }
            System.out.println("writing result.....");
	    dos.writeInt(count);
           
 
            // send the result back to the client.
            //dos.writeUTF(Integer.toString(result));
        }
    }
}
