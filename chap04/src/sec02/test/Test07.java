package sec02.test;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		
		while(run) {
			System.out.println("--------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------");
			System.out.print("선택> ");
			int num = Integer.parseInt(scanner.nextLine());
			switch(num) {
				case 1:
					System.out.print("예금액>");
					balance += Integer.parseInt(scanner.nextLine());
					break;
				case 2:
					System.out.print("출금액>");
					int payment = Integer.parseInt(scanner.nextLine());
					if(balance >= payment) {
						balance -= payment;
					} else {
						System.out.print("금액이 부족합니다.");
					}
					break;
				case 3:
					System.out.print("잔고>" + balance);
					break;
				default:
					System.out.print("\n프로그램 종료");
					run = false;	
			}
			System.out.println();
			
		}
					
	}

}
