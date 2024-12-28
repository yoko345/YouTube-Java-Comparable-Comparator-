package funwithsorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FunWithSorting {
	public static void main(String[] args) {
		Car car1 = new Car("VW", "Golf", "blue", 215);
		Car car2 = new Car("Peugeot", "308 SW", "reaalyy green", 207);
		Car car3 = new Car("BMW", "320i", "black", 212);
		Car car4 = new Car("Tesla", "Model S", "red", 250);

		ArrayList<Car> cars = new ArrayList<Car>();
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);

		System.out.println("Before sort...");
		for (Car car : cars) {
			System.out.println(car);
		}
		System.out.println();

		// Java 8 までの記述方法
		// CarComparatorBrand carSortBrand = new CarComparatorBrand();
		// Collections.sort(cars, carSortBrand);

		// ラムダ式の利用ができるようになってから
		Comparator<Car> bySpeed = (Car carObj1, Car carObj2) -> carObj1.getTopSpeed() - carObj2.getTopSpeed();
		// Collections.sort(cars, bySpeed);
		Comparator<Car> byColor = (Car carObj1, Car carObj2) -> carObj1.getColor().compareTo(carObj2.getColor());
		Collections.sort(cars, byColor);

		System.out.println("After sort...");
		for (Car car : cars) {
			System.out.println(car);
		}
	}
}