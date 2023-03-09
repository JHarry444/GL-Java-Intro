package types;

public class Runner {

	public static void main(String[] args) {
		byte bt = 12;
		short s = 1200;
		int i = 120_000_00;
		long l = 120_000_000_000L;

		float f = 44.94F;
		double d = 4444444.999999999;

		System.out.println(Byte.MAX_VALUE);

		boolean b = false;
		char c = 'J';

		System.out.println("CHAR: " + c);
		System.out.println(c + c);

		String exampleString = "Hello, World!";
//		exampleString = null;
		System.out.println(exampleString.charAt(exampleString.length() - 1));

	}

}
