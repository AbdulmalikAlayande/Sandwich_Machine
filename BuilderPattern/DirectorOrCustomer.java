package SandWich.BuilderPattern;

public class DirectorOrCustomer {
	private final SandwichMachine machine;
	
	public DirectorOrCustomer(SandwichMachine machine) {
		this.machine = machine;
	}
	
	public Sandwich MakeSandwich(String bread, String meat, String cheese, String veggieTopping, String sauce){
		machine.setBreadOnSandwich(bread);
		machine.setMeatOnSandwich(meat);
		machine.setCheeseOnSandwich(cheese);
		machine.setVeggieToppingsOnSandwich(veggieTopping);
		machine.setSauceOnSandwich(sauce);
		return machine.makeSandwich();

	}
	
	@Override
	public String toString() {
		return """
				DirectorOrCustomer{
				machine=$machine
				}""";
	}
}