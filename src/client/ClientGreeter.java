package client;

import java.net.*;
import java.io.*;

public class ClientGreeter {

   public static void main(String [] args) {
	  //1. Create a String for the ip address of the server. 
	  // If you don't know how to find a computer's ip address, ask about ifconfig on linux/mac and ipconfig on windows.
      String ip = "192.168.7.71";
      //2. Create an integer for the server's port number
      int port = 8888;
      //3. Surround steps 4-9 in a try-catch block that catches any IOExceptions.
    
    	 //4. Create an object of the Socket class. When initializing the object, pass in the ip address and the port number
 try {
	Socket socks = new Socket(ip, port);
	DataOutputStream out = new DataOutputStream (socks.getOutputStream());
	String msg = "Hello server, you are being claimed in the name of the High King Sir Andrew Hello server, you are being claimed in the name of the High King Sir Andrew Hello server, you are being claimed in the name of the High King Sir Andrew Hello server, you are being claimed in the name of the High King Sir Andrew Hello server, you are being claimed in the name of the High King Sir Andrew Hello server, you are being claimed in the name of the High King Sir Andrew Hello server, you are being claimed in the name of the High King Sir Andrew Hello server, you are being claimed in the name of the High King Sir Andrew Hello server, you are being claimed in the name of the High King Sir Andrew Hello server, you are being claimed in the name of the High King Sir Andrew. Thnak you for your time.";
	for (int i = 0; i < 10; i++) {
	out.writeUTF(msg);
	}
	DataInputStream in = new DataInputStream (socks.getInputStream());
	System.out.println(in.readUTF());
	socks.close();
} catch (UnknownHostException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
         //5. Create a DataOutputStream object. When initializing it, use the Server object you created in step 4 to call the getOutputStream() method.
         
         //6. Use the DataOutputStream object to send a message to the server using the writeUTF(String message) method
         
         //7. Create a DataInputStream object. When initializing it, use the Server object you created in step 4 to call the getInputStream() method.
         
         //8. Use the DataInputStream object to print a message from the server using the readUTF() method.
         
         //9. Close the client's server object

   }
}
