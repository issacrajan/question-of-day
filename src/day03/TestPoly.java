package day03;

public class TestPoly {

	public static void main(
			String[] args) {
		TestPoly poly = new TestPoly();

//		poly.test(new Car01Impl());
//		poly.test(new Car02Impl());
		poly.test(new Car01Child());
	}

	private void test(
			CarBaseInterface car) {
		car.drive();
		car.model();
	}

}
