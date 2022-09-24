package sec02.exam11;

import java.util.Scanner;

public class CoditionalOperationExample {

	public static void main(String[] args) {
		int score = 85;
		char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C');
		System.out.println(score + "점은 " + grade + "등급입니다." );
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫 번째 수: ");
		double val1 = Double.parseDouble(scanner.nextLine());
		
		System.out.print("두 번째 수: ");
		double val2 = scanner.nextDouble();
		
		System.out.println("-------------------------");
		
		if(val2 != 0.0) {
			System.out.println("결과:" + (val1/val2));
			} else {
				System.out.print("결과:무한대");
			}
		scanner.close();
	}
}
