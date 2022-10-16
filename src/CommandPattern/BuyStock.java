package CommandPattern;

public class BuyStock implements Order{
	private Stock stock;
	private int quantity;
	public BuyStock(Stock stock, int quantity) {
		// TODO Auto-generated constructor stub
		this.stock = stock;
		this.quantity = quantity;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		stock.buy(quantity);
	}
	

}
