package entities;

public class PizzaFactory {
	
	private PizzaFactory() {
	}
	
	public static Pizza getInstance(boolean sweet) {
		return sweet ? new ChocolatePizza() : new PepperoniPizza();
	}
}
