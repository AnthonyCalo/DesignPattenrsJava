package CommandPattern;

public class SellStock implements Order{
	private Stock stock;
	private int quantity;
	public SellStock(Stock stock, int quantity) {
		// TODO Auto-generated constructor stub
		this.stock = stock;
		this.quantity = quantity;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		stock.sell(quantity);
	}
	
}
