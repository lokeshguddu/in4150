package nl.tudelft.in4150.da3.message;

public class Message {

	private int id;
	private int sender;
	private int receiver;
	
	public Message(int id, int sender, int receiver) {
		this.id = id;
		this.sender = sender;
		this.receiver = receiver;
	}

	public int getId() {
		return id;
	}

	public int getSender() {
		return sender;
	}

	public int getReceiver() {
		return receiver;
	}

}