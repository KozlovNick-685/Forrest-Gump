public class Calculator <T extends Number, U extends Number> {

	private T value;
	private U otherValue;

	public Calculator () {
		
	}

	public double add(T a, T b) {
		double result =  a.doubleValue() + b.doubleValue();
		return result;
	}

	public double subtract (T a, T b) {
		double result =  a.doubleValue() - b.doubleValue();
		return result;
	}

	public double multiply (T a, T b) {
		double result =  a.doubleValue() * b.doubleValue();
		return result;
	}

	public double divide (T a, T b) {
		if (b.doubleValue() == 0) {
			throw new IllegalArgumentException("Ты чо? Меняй");
		} else {
			double result =  a.doubleValue() / b.doubleValue();
			return result;
		}
	}

}