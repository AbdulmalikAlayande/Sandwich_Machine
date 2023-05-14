package SandWich.BuilderPattern;

public class Sandwich {
	
	private String veggieToppings;
	private String sauce;
	private String cheese;
	private String meat;
	private String bread;
	
	public void setSandwichBread(String breadType) {
		this.bread = breadType;
	}
	public String getSandwichBread(){
		return bread;
	}
	public void setSandwichMeat(String meatType) {
		this.meat = meatType;
	}
	public String getSandwichMeat(){
		return meat;
	}
	public void setSandwichCheese(String cheeseType) {
		this.cheese = cheeseType;
	}
	public String getSandwichCheese(){
		return cheese;
	}
	public void setSandwichVeggieToppings(String veggieToppingsType) {
		this.veggieToppings = veggieToppingsType;
	}
	public String getSandwichVeggieToppings(){
		return veggieToppings;
	}
	public void setSandwichSauce(String sauceType) {
		this.sauce = sauceType;
	}
	public String getSandwichSauce(){
		return sauce;
	}
	
	@Override
	public String toString() {
		return String.format("%s\n\t\t%s%s\n\t\t%s%s\n\t\t%s%s\n\t\t%s%s\n\t\t%s%s\n%s","Sandwich{","bread: ", bread, "meat: ", meat, "cheese: ", cheese,
				"veggieToppings: ", veggieToppings, "sauce: ", sauce,"}");
	}
}
