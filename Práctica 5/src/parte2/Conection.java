package parte2;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Conection {

	private final int PORT = 1234;

	private final String HOST = "localhost";

	private Message message;

	protected ServerSocket server;

	protected Socket client;

	protected DataOutputStream clientOutput;
	
	protected String serverMessage;

	public Conection(String type) throws IOException {
		switch (type) {
		case "server":
			this.server = new ServerSocket(PORT);
			this.client = new Socket();
			break;

		case "client":
			this.client = new Socket(HOST, PORT);
			break;
		}
	}
}
