import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Client
{
	public static void main(String args[]) throws IOException
	{
		Scanner sc = new Scanner(System.in);

		// Step 1:Create the socket object for
		// carrying the data.
		DatagramSocket ds = new DatagramSocket();
		String inp;
		InetAddress ip = InetAddress.getLocalHost();
		byte buf[] = null;
		int c=0;
		// loop while user not enters "bye"
		while (true)
		{
			inp = "Client started!";
			if(c==0){

				// convert the String input into the byte array.
				buf = inp.getBytes();

				// Step 2 : Create the datagramPacket for sending
				// the data.
				DatagramPacket DpSend =
					new DatagramPacket(buf, buf.length, ip, 5000);

				// Step 3 : invoke the send call to actually send
				// the data.
				ds.send(DpSend);
			}
			c++;
			String inp1 = sc.nextLine();
			// break the loop if user enters "bye"
			if (inp1.equals("exit")){
				 buf = inp1.getBytes();

                                // Step 2 : Create the datagramPacket for sending
                                // the data.
                                DatagramPacket DpSend =
                                        new DatagramPacket(buf, buf.length, ip, 5000);

                                // Step 3 : invoke the send call to actually send
                                // the data.
                                ds.send(DpSend);
                
				break;

			}
		}
	}
}
