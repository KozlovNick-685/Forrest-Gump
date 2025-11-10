public class Main {
	public static void main(String[] args) {
		Product prod = new Product();
		Product prod1 = new Product("Клава", 2000, "Приблуды для компа", true, 1600);
		System.out.println(prod1.displayInfo());
		System.out.println();
		prod1.applyDiscount(20);
		prod1.restock(30);
		prod1.sell(1500);
		System.out.println(prod1.displayInfo());
	}
}