package parte2;

public abstract class Message {

	private int type;

	private String source;

	private String destination;

	private int getType() {
		return this.type;
	}

	private String getSource() {
		return this.source;
	}

	public String getDestination() {
		return this.destination;
	}
}
