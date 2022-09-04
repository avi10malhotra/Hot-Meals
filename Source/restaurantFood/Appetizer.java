package restaurantFood;

public class Appetizer extends Food {

	public Appetizer(String name, int timeToEat, int price) {
		super(name, timeToEat, price);
	}

	@Override
	public String getType() {
		return "Appetizer";
	}

}
