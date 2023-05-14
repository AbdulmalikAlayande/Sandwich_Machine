package SandWich.BuilderPattern;

import java.util.Arrays;

public enum FoodItemType {
	BREAD_TYPE("wheatBread", "whiteBread", "sourdough"),
	MEAT_TYPE("Turkey", "ham", "roastBeef"),
	CHEESE_TYPE("Cheddar", "swiss", "pepperJack"),
	VEGGIE_TOPPINGS_TYPE("Lettuce", "tomato", "onion"),
	SAUCE_TYPE("Mayonnaise", "Ketchup", "mustard");
	                                                                           
	
	private final String[] itemType;

	FoodItemType(String ... itemType) {
		this.itemType = itemType;
	}
	
	public String[] getItemType() {
		String[] type = new String[itemType.length];
		for (String item: itemType) {
				type = itemType;
			}
		return type;
	}
	
}
