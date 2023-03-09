package operators;

public class Runner {
	static String s = "Bloop";

	public static void main(String[] args) {
		int i = 27;
		System.out.println("I: " + i);
		System.out.println("I: " + i++);
		System.out.println("I: " + i);
		System.out.println("I: " + ++i);
		System.out.println("I: " + i);
		double d = 30 / 4;
		System.out.println("D:" + d);
		System.out.println(30 / 4.0);
		System.out.println(!false);

		System.out.println(s);
		{
			String concatenated = concat("Hello, ", "World!");

			System.out.println(concatenated);
		}
//		System.out.println(concatenated); outside of scope
	}

	static String concat(String a, String b) {
		System.out.println(s);
		return a + b;
	}

}
