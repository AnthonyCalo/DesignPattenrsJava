package FactoryPattern;

public class BuffaloChickenPizza extends Pizza{
	public BuffaloChickenPizza() {
		name = "Buffalo Chicken Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		toppings.add("Cheese");
		toppings.add("Blue Cheese");
		toppings.add("Buffalo Chicken");
	}

}
