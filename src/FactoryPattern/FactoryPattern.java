package FactoryPattern;

public class FactoryPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaFactory factory = new PizzaFactory();
		Pizza cheese = factory.createPizza("Cheese");
		cheese.makePizza();
		Pizza pepper = factory.createPizza("Pepporoni");
		pepper.makePizza();
		Pizza buffalo = factory.createPizza("Buffalo chicken");
		buffalo.makePizza();
	}

}
