package CommandPattern;

public class Stock {
	String ticker;
	public Stock(String tick) {
		// TODO Auto-generated constructor stub
		this.ticker = tick;
	}
	public void buy(int quantity) {
		System.out.println("Stock [ Name: "+ticker+", Quantity: " + quantity +" ] bought");
	}
	   public void sell(int quantity){
		      System.out.println("Stock [ Name: "+ticker+",Quantity: " + quantity +" ] sold");
		   }

}
