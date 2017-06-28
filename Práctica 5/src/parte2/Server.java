package parte2;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;

public class Server extends Conection{

	private ArrayList<User> users;
	
	public Server() throws IOException{
		super("server");
	}
	
	public void starServer(){
		try{
			System.setOut(new PrintStream("data.txt"));
			System.out.println("Waiting ...");
			this.client = this.server.accept();
			System.out.println("Client online");
			this.clientOutput = new DataOutputStream(this.client.getOutputStream());
			this.clientOutput.writeUTF("Petition received\nPetition accepted");
			
			BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
			while((this.serverMessage=in.readLine())!=null){
				System.out.println(serverMessage);
			}
			System.out.println("Connection end");
			this.server.close();
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}
}
