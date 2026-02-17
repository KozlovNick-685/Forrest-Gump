public class Main {
	public static void main(String[] args) {

			// Сценарий А:
		//ItemStorage<Integer> obj_1 = new ItemStorage<>(100);
		//obj_1.compareWith(100);
			// Выводит true, т.к. значения попадают в диапазон хэшкода, поэтому могу сравнивать через ==

			// Сценарий Б:
		//ItemStorage<Integer> obj_2 = new ItemStorage<>(200);
		//obj_2.compareWith(200);
			// В данном случае ситуация наоборот, можно сравнивать только через equals

			// Сценарий В:
		RationalFraction a = new RationalFraction(1, 2);
		RationalFraction b = new RationalFraction(1, 2);
		ItemStorage<RationalFraction> obj_3 = new ItemStorage<>(a);
		System.out.println(obj_3.equals(b));
	}
}