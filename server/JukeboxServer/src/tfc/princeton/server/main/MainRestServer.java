package tfc.princeton.server.main;

import java.io.IOException;
import java.net.ServerSocket;

import tfc.princeton.server.constants.RestActionConstants;

public class MainRestServer {

	
	public static void main(String[] args) {
		ServerSocket listening = null;
		try {
			listening = new ServerSocket();  //Server socket. TODO -- fill in args
        } catch (IOException e) {
            System.err.println("Could not listen on port: " + RestActionConstants.PORT_NUMBER);
            e.printStackTrace();
        }
		
		if (listening == null) {
			System.err.println("Could not initialize socket");
			return;
		}
		
		while(true) {
			try {
				
			}
			catch (IOException ex) {
	            System.err.println("Problem in reading client message");
			}
		}
	}
}
