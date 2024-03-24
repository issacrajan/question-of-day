package day03;

public class TestAccess {

	// method level access..
	public void pubMethod() {
		System.out.println("public method");
	}

	void defaultLevelMethod() {
		System.out.println("default level method");
	}

	private void privateMethod() {
		System.out.println("private level method");
	}

	protected void protectedMethod() {
		System.out.println("protected level method");
	}
}
