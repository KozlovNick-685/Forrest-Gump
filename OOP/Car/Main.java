public class Main {
	public static void main(String[] args) {
		Car car = new Car();
		Car car1 = new Car("Dodge", "Challenger", 1969, "черный", 30000, false, 200);
		System.out.println(car1.displayInfo());
		System.out.println();
		car1.startEngine();
		car1.drive(1000);
		car1.repaint("красный");
		car1.updatePrice(20000);
		System.out.println(car1.displayInfo());
	}
}