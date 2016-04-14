package demir;

public class StarbuzzCofee {
	public static void main(String args[]) {
	Beverage beverage = new Decaf();
	System.out.println(beverage.getDescription() + " $" + beverage.cost());
	
	Beverage beverage2 = new Decaf();
	beverage2 = new Milk(beverage2);
	beverage2 = new Milk(beverage2);
	beverage2 = new Milk(beverage2);
	System.out.println(beverage2.getDescription()+ " $" + beverage2.cost());
	}
}