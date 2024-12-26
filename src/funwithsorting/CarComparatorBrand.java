package funwithsorting;

import java.util.Comparator;

public class CarComparatorBrand implements Comparator<Car> {
	@Override
	public int compare(Car car1, Car car2) {
		return car1.getTopSpeed() - car2.getTopSpeed();
	}
}
