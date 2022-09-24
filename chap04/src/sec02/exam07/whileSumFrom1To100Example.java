package sec02.exam07;

public class whileSumFrom1To100Example {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		while(i<=100) {
			sum += i;
			i++;
		}
		
		System.out.println("1~100의 합 : " + sum);
	}

}
