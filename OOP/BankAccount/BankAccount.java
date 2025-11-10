public class BankAccount {

	private String accountNumber;
	private String ownerName;
	private double balance;
	private String currency;
	private boolean isActive;

	//конструкторы

	public BankAccount() {
		this("99999999", "Антонио Маргарейти", 0, "Белорусский рубль", true);
	}

	public BankAccount(String accountNumber, String ownerName) {
		this(accountNumber, ownerName, 0, "Белорусский рубль", true);
	}

	public BankAccount(String accountNumber, String ownerName, double balance, String currency, boolean isActive) {
		this.accountNumber = accountNumber;
		this.ownerName = ownerName;
		this.balance = balance;
		this.currency = currency;
		this.isActive = isActive;
	}

	//методы

	public String displayInfo() {
		return accountNumber + "\n" + ownerName + "\n" + balance + "\n" + currency + "\n" + isActive;
	}

	public double deposit(double amount) {
		balance = balance + amount;
		return balance;
	}

	public double withdraw(double amount) {
		if (balance <= amount) {
			balance = 0;
			return balance;
		} else {
			balance = balance - amount;
			return balance;
		}
	}

	public boolean activateAccount() {
		if (!isActive) {
			isActive = true;
		}
		return isActive;
	}

	public boolean deactvateAccount() {
		if (isActive) {
			isActive = false;
		}
		return isActive;
	}

}