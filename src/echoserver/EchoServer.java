package echoserver;
import java.net.*;
import java.io.*;

public class EchoServer {
	public static final int portNumber = 6013;


	public static void main(String[] args){
	  try{ 
	    // Start listening on the specifed port 
	    ServerSocket sock = new ServerSocket(portNumber);

	    while(true){
	      Socket client = sock.accept();
	      System.out.println("Got a request!");

	    
	      InputStream input = client.getInputStream();
	      OutputStream output = client.getOutputStream();
	      
	      
	      int inputbyte;
	      while((inputbyte = input.read()) != -1){
		output.write(inputbyte);
	      }      
	      output.flush();

	     client.close();
	    }
	    
	    } catch (IOException ioe){
		System.out.println("We caught an unexpected error");
		System.err.println(ioe);

	    }

	}//end main 

}
