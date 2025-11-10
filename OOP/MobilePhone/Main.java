public class Main {
	public static void main(String[] args) {
		MobilePhone mob = new MobilePhone();
		MobilePhone mob1 = new MobilePhone("pAshkaPhone", "11-504", 128, 14, false);
		System.out.println(mob1.displayInf());
		System.out.println();
		mob1.powerOn();
		mob1.chargeBattery(50);
		System.out.println(mob1.displayInf());
	}
}