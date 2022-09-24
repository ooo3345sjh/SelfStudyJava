package sec01.exam24;

public class StringToPrimitiveValueExample {

	public static void main(String[] args) {
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1:" + value1);
		System.out.println("value1:" + value2);
		System.out.println("value1:" + value3);
		
		Double a = 3.14;
		Double b = 3.14;
		
		System.out.println( a== b);
	}

}
