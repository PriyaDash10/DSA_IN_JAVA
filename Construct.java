class ConstructorOverload {

	public ConstructorOverload() {
		System.out.println("No Output");
	}

	public ConstructorOverload(int x) {
		System.out.println("x^2 = " + (x * x));
	}

	public ConstructorOverload(int x, double y) {
		System.out.println("x*y = " + (x * y));
	}

	public ConstructorOverload(double x, double y) {
		System.out.println("x*y = " + (x * y));
	}
}

public class ConstructOverloading {

	public static void main(String[] args) {

		ConstructorOverload ob1 = new ConstructorOverload();
		ConstructorOverload ob2 = new ConstructorOverload(4);
		ConstructorOverload ob3 = new ConstructorOverload(4, 4.5);
		ConstructorOverload ob4 = new ConstructorOverload(4.5, 5.6);

	}
}