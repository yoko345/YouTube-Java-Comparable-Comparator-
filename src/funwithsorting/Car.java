package funwithsorting;

public class Car implements Comparable<Car> {
	private String brand; // BMW, VW, Peugeot, Ferrari
	private String model; // M5, Golf
	private String color; // red, green, blue
	private int topSpeed;

	public Car(String brand, String model, String color, int topSpeed) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.topSpeed = topSpeed;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", color=" + color + ", topSpeed=" + topSpeed + "]";
	}

	@Override
	public int compareTo(Car other) {
		return this.brand.compareTo(other.brand);
	}

}
