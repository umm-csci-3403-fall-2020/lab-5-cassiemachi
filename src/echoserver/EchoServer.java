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

	      // Creates new PrintWriter with autoFlush
	      InputStream input = socket.getInputStream();
	      PrintWriter writer = new PrintWriter(client.getOutputStream(), true);
	      
	      writer.println(input);

	      client.close();
		}
	    } catch (IOException ioe){
		System.out.println("We caught an unexpected error");
		System.err.println(ioe);

	    }

	}//end main 

}
