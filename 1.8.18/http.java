import java.io.*;
import java.net.*;
public class http{
	public static void main(String ars[])throws IOException{
		String line="hey";
		ServerSocket server = new ServerSocket(8080);
		System.out.println("Listening");
		while(true){
			Socket clientsocket = server.accept();
			InputStreamReader isr= new InputStreamReader(clientsocket.getInputStream());
			BufferedReader reader = new BufferedReader(isr);
			while(!line.isEmpty()){
				System.out.println(line);
				line = reader.readLine();
			}
		}

	}

}
