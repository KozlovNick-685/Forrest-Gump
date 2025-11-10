public class Student {

	private String firstName;
	private String lastName;
	private int age;
	private String group;
	private double averageGrade;
	private boolean isActive;

	public Student() {
		this("Name", "LastName", "Group", 18, 0.0, true);
			//this.firstName = "Name";
			//this.lastName = "LastName";
			//this.age = 18;
			//this.group = "Group";
			//this.averageGrade = 0.0;
			//this.isActive = true;
	}

	public Student(String firstName, String lastName, String group) {
		this(firstName, lastName, group, 18, 0.0, true);
		 	//this.firstName = firstName;
		  	//this.lastName = lastName;
		 	//this.age = 18;
		  	//this.group = group;
		  	//this.averageGrade = 0.0;
		  	//this.isActive = true;
	}

	public Student(String firstName, String lastName, String group, int age, double averageGrade, boolean isActive) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.group = group;
		this.averageGrade = averageGrade;
		this.isActive = isActive;
	}

	//Методы (поведение)

	public String displayInfo() {
		String result = firstName + "\n" + lastName + "\n" + group;
		return result;
		//return firstName + "\n" + lastName + "\n" + group;
	}

	public double updateGrade(double newGrade) {
		averageGrade = newGrade;
		return newGrade;
	}
}