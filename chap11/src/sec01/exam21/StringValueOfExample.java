package sec01.exam21;

public class StringValueOfExample {

	public static void main(String[] args) {
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(10.5);
		String str3 = String.valueOf(true);
		String str4 = String.valueOf("¾Æ´Ï");
		String str5 = String.valueOf('a');
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
	}

}
