package sec02.answer;

import java.util.Scanner;

public class exam09 {

	public static void main(String[] args) {
		//키보드로 두 실수를 다음과 같이 입력받았습니다.(Scanner이용). 입력된 첫 번째 수에 두 번째 수를 나눈 결과를 "결과:값"으로 
		//출력하되. 두 번째 수에 0 또는 0.0이 입력되었을 경우 "결과:무한대"가 출력되도록 코드를 작성해보세요(Scanner의 next()사용).
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫 번째 수: ");
		double num1 = Double.parseDouble(scanner.nextLine());
		System.out.print("두 번째 수: ");
		double num2 = Double.parseDouble(scanner.nextLine());
		
		System.out.println("-------------------");
		
		if(num2 != 0.0) {
			System.out.println("결과:" + (num1/num2) );
		} else {
			System.out.println("결과:무한대");
		}
		
		scanner.close();
		
	}

}
