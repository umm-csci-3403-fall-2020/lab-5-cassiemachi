package echoserver;
import java.net.*;
import java.io.*;

public class EchoClient {
	public static final int portNumber = 6013;

	public static void main(String[] args) throws IOException{
	  String server; 
	  // Use local host if no server specified
	  if(args.length == 0){
		server = "127.0.0.1";
	  } 
	  else{
		server = args[0];
	  }

	  try{
	  // Connect to server
	  Socket socket = new Socket(server, portNumber);

	  // read byte form keyboard
	  InputStream is = null;
	  OutputStream os = null;
	  int inputbyte = is.read();
	  while(inputbyte != -1){
	  	// send byte to server
		os.write(inputbyte);
		inputbyte = is.read();
	  }
	  is.close();
	  //send single byte to server
	  //read byte from the server
	  //print that byte
	  
	  }// end try
	  catch(IOException ioe){
	    System.out.println("We caught an unexpected exception");
	  }

	}// end main 
}// end echoclient
