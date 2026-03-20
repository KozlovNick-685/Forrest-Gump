public class Main {
	public static void main(String[] args) {
		Calculator<Double> obj_1 = new Calculator<>();
		Calculator<Integer> obj_2 = new Calculator<>();
		System.out.println(obj_2.add(50, 2));
		System.out.println(obj_1.subtract(50.0, 60.0));
		System.out.println(obj_1.multiply(50.0, 2.0));
		System.out.println(obj_1.divide(50.0, 2.0));

		RationalFraction x = new RationalFraction(1, 5);
		RationalFraction y = new RationalFraction(1, 5);

		Calculator<RationalFraction> drob = new Calculator<>();
		System.out.println(drob.add(x, y));
	}
}