package SandWich.BuilderPattern;

import java.util.Objects;

public class SandwichMain {
	public static void main(String[] args) {
		Sandwich sandwich = new Sandwich();
		SandwichMachine machine = new SandwichMachine(sandwich);
		DirectorOrCustomer customer = new DirectorOrCustomer(machine);
		SandwichMainMenu menu = new SandwichMainMenu();
		for (FoodItemType food: FoodItemType.values()) {
			for (String meatType : food.getItemType()) {
				if (Objects.equals(meatType, "Turkey")){
					String userChoice = meatType;
					System.out.println(userChoice);
					break;
				}
			}
		}
		 menu.displayWelcome();
	}
}
