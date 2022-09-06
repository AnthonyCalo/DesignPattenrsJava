package ObserverPattern;

public class Mail {
	String recieverName;
	String address;
	String content;
	
	public Mail(String name, String address, String content) {
		this.recieverName = name;
		this.address = address;
		this.content = content;
	}
}
