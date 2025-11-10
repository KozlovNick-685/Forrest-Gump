public class Book {

	private String title; 				//название книги
	private String author; 				//автор
	private int year; 					//год издания
	private boolean isAvailable; 		//доступна ли для выдачи
	private int pageCount; 				//количество страниц

	//конструкторы

	public Book() {
		this("title", "author", 0, true, 0);
	}

	public Book(String title, String author, int year) {
		this(title, author, year, true, 0);
	}

	public Book(String title, String author, int year, boolean isAvailable, int pageCount) {
		this.title = title;
		this.author = author;
		this.year = year;
		this.isAvailable = isAvailable;
		this.pageCount = pageCount;
	}

	//методы

	public String displayInfo() {
		return title + "\n" + author + "\n" + year + "\n" + isAvailable + "\n" + pageCount;
	}

	public boolean borrowBook() {
		if (isAvailable) {
			isAvailable = false;
			return isAvailable;
		} else {
			return isAvailable;
		}
	}

	public boolean returnBook() {
		if (!isAvailable) {
			isAvailable = true;
			return isAvailable;
		} else {
			return isAvailable;
		}
	}

	public int updateYear(int newYear) {
		year = newYear;
		return newYear;
	}

}