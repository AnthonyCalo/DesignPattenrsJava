package VisitorPattern;


//This pattern is neat because it implement double dynamic dispatch. 
//Dynamic dispatch = runtime polymorphism
public class VisitorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Visitor<String> SportsFan = new SportsFan();
		Visitor<Double> shopper = new Shopper();
		City ny = new NY();
		City vegas = new Vegas();
		ny.accept(SportsFan);
		vegas.accept(SportsFan);
		vegas.accept(shopper);
		ny.accept(shopper);
	}

}
