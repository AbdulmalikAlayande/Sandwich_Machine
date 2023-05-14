package SandWich.BuilderPattern;

import java.util.Objects;

public class SandwichMachine {
	
	private final Sandwich sandwich;
	
	public SandwichMachine(Sandwich sandwich){
		this.sandwich = sandwich;
	}
	
	public void setBreadOnSandwich(String breadType){
		this.sandwich.setSandwichBread(breadType);
	}
	public String getBreadOnSandwich() {
		return sandwich.getSandwichBread();
	}
	public void setMeatOnSandwich(String meatType){this.sandwich.setSandwichMeat(meatType);}
	
	public String getMeatOnSandwich() {
		return sandwich.getSandwichMeat();
	}
	
	public void setCheeseOnSandwich(String cheeseType){this.sandwich.setSandwichCheese(cheeseType);}
	
	public String getCheeseOnSandwich() {
		return sandwich.getSandwichCheese();
	}
	
	public void setVeggieToppingsOnSandwich(String veggieToppingsType){this.sandwich.setSandwichVeggieToppings(veggieToppingsType);}
	
	public String getVeggieToppingsOnSandwich() {
		return sandwich.getSandwichVeggieToppings();
	}
	public void setSauceOnSandwich(String sauceType){
		this.sandwich.setSandwichSauce(sauceType);
	}
	
	public String getSauceOnSandwich() {
		return sandwich.getSandwichSauce();
	}
	public Sandwich makeSandwich() {
		return sandwich;
	}
	
	public String foodItemTypes(String userChoice){
		for (FoodItemType food: FoodItemType.values()) {
			for (String meatType: food.getItemType()) {
				if (Objects.equals(meatType, "Turkey")){
					userChoice = meatType;
				}
				break;
			}
		}
		return userChoice;
	}
	
	@Override
	public String toString() {
		return "SandwichMachine{" +
				       "sandwich=" + sandwich.toString() +
				       '}';
	}
}
