package FactoryPattern;

public class PizzaFactory {
	public Pizza createPizza(String type) {
		Pizza pizza =null;
		if(type.equals("Cheese")){
			pizza = new CheesPizza();
		}else if (type.equals("Pepporoni")){
			pizza = new PepporoniPizza();
		}else if(type.equals("Buffalo chicken")) {
			pizza = new BuffaloChickenPizza();
		}
		return pizza;
	}
}
