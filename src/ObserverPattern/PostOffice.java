package ObserverPattern;

import java.util.ArrayList;

public class PostOffice implements Subject{
	private ArrayList<Mail> allMail;
	private ArrayList<Observer> observers;
	
	public PostOffice()
	{
		allMail = new ArrayList<>();
		observers = new ArrayList<>();
	}
	
	public void addMail(Mail m) {
		allMail.add(m);
		Notify();
	}
	
	
	
	public ArrayList<Mail> getState(){
		return allMail;
	}
	@Override
	public void Attach(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void Dettach(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
		
	}

	@Override
	public void Notify() {
		// TODO Auto-generated method stub
		for(Observer obs: observers) {
			obs.update(this);
			
		}
		
	}
	

}
