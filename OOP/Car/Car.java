public class Car {

	private String brand;
	private String model;
	private int year;
	private String color;
	private double price;
	private boolean isRunning;
	private double mileage;

	//конструкторы

	public Car() {
		this("brand", "model", 0000, "color", 0, true, 0);
	}

	public Car(String brand, String model, int year) {
		this(brand, model, year, "color", 0, true, 0);
	}

	public Car(String brand, String model, int year, String color, double price, boolean isRunning, double mileage) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.color = color;
		this.price = price;
		this.isRunning = isRunning;
		this.mileage = mileage;
	}

	//методы

	public String displayInfo() {
		return brand + "\n" + model + "\n" + year + "\n" + color + "\n" + price + "\n" + isRunning + "\n" + mileage;
	}

	public boolean startEngine() {
		if (!isRunning) {
			isRunning = true;
		}
		return isRunning;
	}

	public boolean stopEngine() {
		if (isRunning) {
			isRunning = false;
		}
		return isRunning;
	}

	public double drive(double distance) {
		mileage = mileage + distance;
		return mileage;
	}

	public String repaint(String newColor) {
		color = newColor;
		return color;
	}

	public double updatePrice(double newPrice) {
		price = newPrice;
		return price;
	}

}