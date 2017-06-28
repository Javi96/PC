package parte2;

import java.io.IOException;

public class MainClient {

	public static void main(String[] args) throws IOException {
		Client client = new Client();
		
		System.out.println("Launch main. Client execution");
		client.startClient();
	}
}
