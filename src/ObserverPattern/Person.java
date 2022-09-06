package ObserverPattern;

import java.util.ArrayList;

public class Person implements Observer{
	String name;
	public Person(String name) {this.name = name;}
	
	public void checkMail(ArrayList<Mail> mails) {
		for(int i=0; i< mails.size(); i++) {
			if(name.compareTo(mails.get(i).recieverName)==0) {
				System.out.println(name + ": " + mails.get(i).content);
			}
		}
	}
	
	public void update(Object obj) {
		if(obj instanceof PostOffice) {
			PostOffice po = (PostOffice) obj;
			checkMail(po.getState());
			
		}
	}
	
}
