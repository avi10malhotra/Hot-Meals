package restaurantFood;

import java.util.ArrayList;

public abstract class Food {

	private String name;  // Name of the dish
	private int eatingTime;
	private int price;
	
	public String getName() { return this.name; }
	public int timeToEat() { return this.eatingTime; }
	public int getPrice() { return this.price; }
	public abstract String getType();
	
	public Food(String name, int timeToEat, int price) {
		this.name = name;
		this.eatingTime = timeToEat;
		this.price = price;
	}

	public static int getTotalTime(ArrayList<Food> items) {
		int sum = 0;
		for(Food f: items)
			sum += f.timeToEat();
		return sum;
	}
}
