package sec02.test;

public class Test02 {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=3; i<=100;) {
			sum += i;
			i = i+3;
		}
		
		System.out.println("1~100사이의 3의 배수 합 : " + sum);
		
		sum = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%3==0) {
				sum += i;	
			}
		}
		System.out.println("1~100사이의 3의 배수 합 : " + sum);
	}
}
