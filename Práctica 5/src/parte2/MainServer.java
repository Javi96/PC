package parte2;

import java.io.IOException;

public class MainServer {

	public static void main(String[] args) throws IOException {
		Server server = new Server();
		System.out.println("Launch main. Server execution");
		server.starServer();
	}
}
