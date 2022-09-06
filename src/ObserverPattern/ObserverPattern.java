package ObserverPattern;

public class ObserverPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PostOffice postoffice = new PostOffice();
		Person alice = new Person("Alice");
		Person bob = new Person("Bob");
		Mail m = new Mail("Alice", "Bill", "I am you father");
		Mail m2 = new Mail("Bob", "Kevin James", "Everybody loves Raymond");
		
		postoffice.Attach(alice);
		postoffice.Attach(bob);
		
		postoffice.addMail(m);
		postoffice.addMail(m2);

	}	

}
