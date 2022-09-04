package restaurantFood;

public class MainCourse extends Food {

	public MainCourse(String name, int timeToEat, int price) {
		super(name, timeToEat, price);
	}

	@Override
	public String getType() {
		return "Main Course";
	}
}
