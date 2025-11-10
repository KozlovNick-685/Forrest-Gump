public class Product {

	private String name;
	private double price;
	private String category;
	private boolean inStock;
	private int quantity;

	//конструкторы

	public Product() {
		this("name", 0, "category", true, 0);
	}

	public Product(String name, double price, String category) {
		this(name, price, category, true, 0);
	}

	public Product(String name, double price, String category, boolean inStock, int quantity) {
		this.name = name;
		this.price = price;
		this.category = category;
		this.inStock = inStock;
		this.quantity = quantity;
	}

	//методы

	public String displayInfo() {
		return name + "\n" + price + "\n" + category + "\n" + inStock + "\n" + quantity;
	}

	public double applyDiscount(double percent) {
		price = price - (price * (percent / 100));
		return price;
	}

	public int restock(int amount) {
		quantity = quantity + amount;
		return quantity;
	}

	public void sell(int amount) {
		if (quantity >= amount) {
			quantity = quantity - amount;
		} else {
			System.out.println("Такого количества нет в наличии");
		}
	}

}