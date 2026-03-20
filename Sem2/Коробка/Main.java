public class Main {
	public static void main(String[] args) {
		Box<Integer> box_1 = new Box<>();
		Box<Double> box_2 = new Box<>();
		if (box_1.getClass() == box_2.getClass()) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}