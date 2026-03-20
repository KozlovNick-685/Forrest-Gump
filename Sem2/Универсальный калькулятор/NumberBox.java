public class NumberBox<T extends Number> {

	private T[] array;

	public NumberBox(T[] array) {
		this.array = array;
	}

	public T[] getNumbers() {
		return array;
	}

	public void setNumbers(T[] numbers) {
		array = numbers;
	}

	public static void printSquared(NumberBox<?> box) {
		for(Number num : box.getNumbers()) {
			double result = UniversalCalculator.multiply(num, num);
			System.out.println(result);
		}
	}

	public static double sum(NumberBox<?> box) {
		double result = 0.0;
		for(Number num : box.getNumbers()) {
			result = UniversalCalculator.add(result, num);
		}
		return result;
	}

	public static void fillWithRandom(NumberBox<Double> box) {
		Double[] numbers = box.getNumbers();
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = Math.random();
		}
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

	public static void copy(NumberBox<? extends Number> box_1, NumberBox<? super Number> box_2) {
		Number[] numbers_1 = box_1.getNumbers();
		Number[] numbers_2 = box_2.getNumbers();
		for(int i = 0; i < numbers_1.length; i++) {
			numbers_2[i] = numbers_1[i];
		}
		for(int i = 0; i < numbers_2.length; i++) {
			System.out.println(numbers_2[i]);
		}
	}

	public static NumberBox<Double> addBoxes(NumberBox<?> box_1, NumberBox<?> box_2) {
		Number[] numbers_1 = box_1.getNumbers();
		Number[] numbers_2 = box_2.getNumbers();
		if (numbers_1.length != numbers_2.length) {
            throw new IllegalArgumentException("Размеры коробок не совпадают!");
        }
        Double[] numbers_3 = new Double[numbers_1.length];
        for(int i = 0; i < numbers_1.length; i++) {
        	numbers_3[i] = UniversalCalculator.add(numbers_1[i], numbers_2[i]);
        }
        return new NumberBox<Double>(numbers_3);
	}

	public void append(NumberBox<? extends T> other) {
		T[] numbers_1 = other.getNumbers();
		T[] numbers_2 = this.array;
		T[] numbers_3 = (T[]) new Number[this.array.length + numbers_1.length];
		for(int i = 0; i < numbers_2.length; i++) {
			numbers_3[i] = numbers_2[i];
		}
		for(int i = 0; i < numbers_1.length; i++) {
			numbers_3[numbers_2.length + i] = numbers_1[i];
		}

		this.array = numbers_3;
		for(int i = 0; i < this.array.length; i++) {
			System.out.println(array[i]);
		}
	}

}