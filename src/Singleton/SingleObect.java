package Singleton;

//j is missing in the word object(i know)
public class SingleObect {
	private static SingleObect instance = new SingleObect(); 
	private SingleObect() {
		
	}
	
	 public static SingleObect getInstance(){
	      return instance;
	   }
	 
	 public void showMessage() {
		 System.out.println("This is the only instance of this object in the whole program");
	 }
	
}
