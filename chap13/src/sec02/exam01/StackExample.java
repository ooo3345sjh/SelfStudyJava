package sec02.exam01;

import java.util.*;

public class StackExample {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(100)); //동전을 끼움
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while(true) { //동전 케이스가 비었는지 확인
			if(!coinBox.isEmpty()) {
				Coin coin = coinBox.pop(); //동전 케이스에서 제일 위의 동전을 꺼냄
				System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
			} else {
				System.out.println("동전 케이스가 비었습니다.");
				break;
			}
				
		}
	}

}
