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
	  InputStream is = socket.getInputStream();
	  OutputStream os = socket.getOutputStream();
	  int inputbyte;
	  while((inputbyte = System.in.read())!= -1){
	  	// write byte
		os.write(inputbyte);
		os.flush();
		// send byte to server
		System.out.write(is.read());
		System.out.flush();
		
	  }
	  is.close();
	  socket.close();
	 
	  
	  }// end try
	  catch(IOException ioe){
	    System.out.println("We caught an unexpected exception");
	  }

	}// end main 
}// end echoclient
