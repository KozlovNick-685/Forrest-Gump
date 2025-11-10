public class Main {
	public static void main(String[] args) {
		BankAccount bank = new BankAccount();
		BankAccount bank2 = new BankAccount("432423", "fsdfs");
		BankAccount bank1 = new BankAccount("784873409", "Павлик Кожевников", 2342, "Роблоксы", true);
		//System.out.println(bank1.displayInfo());
		//System.out.println();
		//bank1.deposit(10.0);
		//bank1.withdraw(10.0);
		//bank1.activateAccount();
		//bank1.deactvateAccount();
		//System.out.println(bank1.displayInfo());
		System.out.println(bank2.displayInfo());
	}
}