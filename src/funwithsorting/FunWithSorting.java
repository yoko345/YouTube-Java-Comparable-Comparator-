package funwithsorting;

import java.util.ArrayList;
import java.util.Collections;

public class FunWithSorting {
	public static void main(String[] args) {
		Car car1 = new Car("VW", "Golf", "blue", 215);
		Car car2 = new Car("Peugeot", "308 SW", "reaalyy green", 207);
		Car car3 = new Car("BMW", "320i", "black", 212);
		Car car4 = new Car("Tesla", "Model S", "red", 250);
		
		ArrayList<Car> cars=new ArrayList<Car>();
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		
		for(Car car: cars) {
			System.out.println(car);
		}
		
		Collections.sort(cars);
	}
}