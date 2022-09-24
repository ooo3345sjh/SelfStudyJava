package sec02.test;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());
		
		for(int i=0; i<num; i++) {
			for(int j=num-1; j>=0; j--) {
				if(i<j) {
					System.out.print("");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		scanner.close();
	}
}
