package sec02.exam03;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car(); //Car객체 생성
		
		for(int i=1; i<=7; i++) {
			int problemLocation = car.run(); //Car객체의 run()메소드 5번 반복 실행
			
			switch(problemLocation) {
				case 1: // 앞쪽 타이어가 펑크났을 때 HankookTire로 교체
					System.out.println("앞왼쪽 HankookTire로 교체");
					car.frontLeftTire = new HankookTire("앞왼쪽", 15);
					break;
				case 2: //앞오른쪽 타이어가 펑크 났을 때 KumhoTire로 교체
					System.out.println("앞오른쪽 KumhoTire로 교체");
					car.frontRightTire = new KumhoTire("앞오른쪽", 13);
					break;
				case 3://뒤왼쪽 타이어가 펑크 났을 때 HankookTire로 교체
					System.out.println("뒤왼쪽 HankookTire로 교체");
					car.backLeftTire = new HankookTire("뒤왼쪽", 14);
					break;
				case 4://뒤오른쪽 타이어가 펑크 났을 때 KumhoTire로 교체
					System.out.println("뒤오른쪽 HankookTire로 교체");
					car.backRightTire = new HankookTire("뒤오른쪽", 17);
					break;
			}
			System.out.println("----------------------------------");
		}
	}

}
