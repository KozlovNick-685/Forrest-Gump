public class Main {
	public static void main(String[] args) {
		Book book = new Book();
		Book book1 = new Book("Герберт Уэллс", "Война Миров", 1897, false, 400);
		Book book2 = new Book("Роберт Льюис Стивенсон", "Остров Сокровищ", 1883);

		//System.out.println(book1.displayInfo());
		//System.out.println();
		//System.out.println(book1.borrowBook());
		//book1.returnBook();
		book1.updateYear(1923);
		//System.out.println();
		System.out.println(book1.displayInfo());
	}
}