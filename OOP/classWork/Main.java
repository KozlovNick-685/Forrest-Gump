public class Main {
	public static void main(String[] args) {
		Student student = new Student();
		Student student1 = new Student("Николай", "Козлов", "11-504");
		Student student2 = new Student("Иван", "Иванов", "11-504", 20, 54.0, true);

		System.out.println(student2.displayInfo());
		System.out.println(student2.updateGrade(32.5));
	}
}