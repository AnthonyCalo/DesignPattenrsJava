package CommandPattern;

public class CommandMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stock coned = new Stock("ED");
		Stock msft = new Stock("MSFT");
		Stock amd = new Stock("AMD");
		Stock ms = new Stock("MS");
		
		Order Smsft = new SellStock(msft, 100);
		Order samd = new SellStock(amd, 100);
		Order bed = new BuyStock(coned, 500);
		Order bms = new BuyStock(ms, 1000);
		Broker broker = new Broker();
		broker.takeOrder(Smsft);
		broker.takeOrder(samd);
		broker.takeOrder(bed);
		broker.takeOrder(bms);
		broker.placeOrders();
	}

}
