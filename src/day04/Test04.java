package day04;

import java.util.ArrayList;
import java.util.List;

import day03.TestAccess;

public class Test04 extends TestAccess {

	private List<String> list = new ArrayList<>();

	public static void main(
			String[] args) {
		Test04 t = new Test04();

		t.pubMethod();
	}

	@Override
	public void pubMethod() {
		list = new ArrayList<>();
		list.add("one");
		list.add("two");
		System.out.println("i am overriding the implementation");
	}

}
