package SandWich.BuilderPattern;


import javax.swing.*;
import java.util.Objects;

public class SandwichMainMenu {
	Sandwich sandwich = new Sandwich();
	SandwichMachine machine = new SandwichMachine(sandwich);
	DirectorOrCustomer customer = new DirectorOrCustomer(machine);
	private String customerName;
	private String userChoiceForBread;
	private String userChoiceForMeat;
	private String userChoiceForCheese;
	private String userChoiceForVeggieToppings;
	private String userChoiceForSauce;
	
	public void displayWelcome() {
		Pane.abdulmalikPrint("Welcome dear customer");
		askCustomerToMakeSandwich();
	}
	
	private String collectCustomersName() {
		customerName = Pane.abdulmalikInput("Please what is your name: ");
		return customerName;
	}
	
	private void askCustomerToMakeSandwich() {
		String customerOption = Pane.abdulmalikInput(collectCustomersName()+" Would you like to make a sandwich(yes or no)\nPress any key to exit").toLowerCase();
		askCustomer(customerOption);
	}
	
	private void displayVarietiesOfSandwichItems() {
		Pane.abdulmalikPrint("""
				we have a variety of sandwich ingredients and they have different types
				which are according to your taste:
				1.) Bread
				2.) Meat
				3.) Cheese
				4.) Veggie toppings
				5.) Sauce
				""");
		promptCustomersToPickBreadType();
		promptCustomersToPickMeatType();
		promptCustomersToPickCheeseType();
		promptCustomersToPickVeggieToppingsType();
		promptCustomersToPickSauceType();
		makeSandwich();
	}
	
	private String promptCustomersToPickBreadType() {
		String breadTypes = Pane.abdulmalikInput("""
				We also have a variety of bread
				Enter
				1 --> wheatBread
				2 --> whiteBread
				3 --> sourdough""");
		switch (Integer.parseInt(String.valueOf(breadTypes.charAt(0)))){
			case 1 -> loopThroughFoodTypes("wheatBread");
			case 2 -> loopThroughFoodTypes("whiteBread");
			case 3 -> loopThroughFoodTypes("sourdough");
			default -> {
						Pane.abdulmalikPrint("Invalid choice");
						promptCustomersToPickBreadType();
					}
				}
				return userChoiceForBread;
	}
	
	private String promptCustomersToPickMeatType() {
		String meatTypes = JOptionPane.showInputDialog("""
				We also have a variety of meat for sandwich
				Enter
				1 --> Turkey
				2 --> roastBeef
				3 --> ham""");
		switch (Integer.parseInt(meatTypes)) {
			case 1 -> loopThroughFoodTypes("Turkey");
			case 2 -> loopThroughFoodTypes("roastBeef");
			case 3 -> loopThroughFoodTypes("ham");
			default -> {
				Pane.abdulmalikPrint("Invalid choice");
				promptCustomersToPickMeatType();
			}
		}
		return userChoiceForMeat;
	}
	
	private String promptCustomersToPickCheeseType() {
		String cheeseTypes = JOptionPane.showInputDialog("""
				We also have a variety of cheese
				Enter
				1 --> cheddar
				2 --> swiss
				3 --> pepper Jack""");
		switch (Integer.parseInt(cheeseTypes)) {
			case 1 -> loopThroughFoodTypes("cheddar");
			case 2 -> loopThroughFoodTypes("swiss");
			case 3 -> loopThroughFoodTypes("pepperJack");
			default -> {
				Pane.abdulmalikPrint("Invalid choice");
				promptCustomersToPickCheeseType();
			}
		}
		return userChoiceForCheese;
	}
	
	private String promptCustomersToPickVeggieToppingsType() {
		String veggieToppingsTypes = JOptionPane.showInputDialog("""
				We also have a variety of veggie toppings
				Enter
				1 --> Lettuce
				2 --> Tomato
				3 --> onion""").toLowerCase();
		switch (Integer.parseInt(veggieToppingsTypes)) {
			case 1 -> loopThroughFoodTypes("Lettuce");
			case 2 -> loopThroughFoodTypes("tomato");
			case 3 -> loopThroughFoodTypes("onion");
			default -> {
				Pane.abdulmalikPrint("Invalid choice");
				promptCustomersToPickVeggieToppingsType();
			}
		}
		return userChoiceForVeggieToppings;
	}
	
	private String promptCustomersToPickSauceType() {
		String sauceTypes = JOptionPane.showInputDialog("""
				We also have a variety of sandwich sauces
				Enter
				1 --> Mayonnaise
				2 --> Ketchup
				3 --> mustard""");
		switch (Integer.parseInt(sauceTypes)) {
			case 1 -> loopThroughFoodTypes("Mayonnaise");
			case 2 -> loopThroughFoodTypes("Ketchup");
			case 3 -> loopThroughFoodTypes("mustard");
			default -> {
				Pane.abdulmalikPrint("Invalid choice");
				promptCustomersToPickSauceType();
			}
		}
		return userChoiceForSauce;
	}
	private void makeSandwich() {
		Pane.abdulmalikPrint(customer.MakeSandwich(userChoiceForBread, userChoiceForMeat, userChoiceForCheese, userChoiceForVeggieToppings, userChoiceForSauce));
		askCustomerToMakeAnotherSandwich();
	}
	
	private void askCustomerToMakeAnotherSandwich() {
		String customerOption = Pane.abdulmalikInput(customerName+" Would you like to make another sandwich(yes or no)\nPress any key to exit").toLowerCase();
		askCustomer(customerOption);
	}
	
	private void askCustomer(String customerOption) {
		if (customerOption.equals("yes")) {
			displayVarietiesOfSandwichItems();
		}
		else if (customerOption.equals("no")) {
			String customerOption2 = Pane.abdulmalikInput("would you like to quit: ");
			if (customerOption2.equals("yes")) {
				System.exit(0);
			} else if (customerOption2.equals("no"))
				displayWelcome();
		}  else System.exit(0);
	}
	
	private String loopThroughFoodTypes(String item){
		for (FoodItemType food : FoodItemType.values()) {
			for (String foodType : food.getItemType()) {
				if (Objects.equals(foodType, item)){
					loopThroughBread(foodType);
					loopThroughMeat(foodType);
					loopThroughCheese(foodType);
					loopThroughVeggieToppings(foodType);
					loopThroughSauce(foodType);
					return foodType;
				}
			}
		}
		return null;
	}
	
	private String loopThroughBread(String valueToFind){
		for (String value : FoodItemType.BREAD_TYPE.getItemType()) {
			if (Objects.equals(value, valueToFind)) {
				userChoiceForBread = value;
				return userChoiceForBread;
			}
		}
		return null;
	}
	private void loopThroughMeat(String valueToFind){
		for (String value : FoodItemType.MEAT_TYPE.getItemType()) {
			if (Objects.equals(value, valueToFind)) {
				userChoiceForMeat = value;
				break;
			}
		}
	}
	
	private void loopThroughCheese(String valueToFind){
		for (String value : FoodItemType.CHEESE_TYPE.getItemType()) {
			if (Objects.equals(value, valueToFind)) {
				userChoiceForCheese = value;
				break;
			}
		}
	}
	private void loopThroughVeggieToppings(String valueToFind){
		for (String value : FoodItemType.VEGGIE_TOPPINGS_TYPE.getItemType()) {
			if (Objects.equals(value, valueToFind)) {
				userChoiceForVeggieToppings = value;
				break;
			}
		}
	}
	
	private void loopThroughSauce(String valueToFind){
		for (String value : FoodItemType.SAUCE_TYPE.getItemType()) {
			if (Objects.equals(value, valueToFind)) {
				userChoiceForSauce = value;
				break;
			}
		}
	}
	
	
}
