package parte2;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client extends Conection {

	private String name;

	private Socket socket;

	private BufferedReader reader;

	public Client() throws IOException {
		super("client");
	}

	public void startClient() {
		try {
			this.clientOutput = new DataOutputStream(
					this.client.getOutputStream());
			for (int i = 1; i < 3; i++) {
				this.clientOutput.writeUTF("Message number" + i);
			}
			client.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
