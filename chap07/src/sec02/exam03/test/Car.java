package sec02.exam03.test;

public class Car {
	//필드
	Tire frontLeftTire = new Tire("앞왼쪽", 6, 1);
	Tire frontRightTire = new Tire("앞오른쪽", 2, 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3, 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4, 4);
	
	//생성자
	
	//메소드
	int run() { 
		/*
		모든 타이어를 1회 회전시키기위해 각 Tire객체의 roll()메소드를 호출. 
		false를 리턴하는 roll()이 있을 경우 stop()메소드를 호출하고 해당 타이어번호를 리턴
		
		System.out.println("[자동차가 달립니다.");
		if(frontLeftTire.roll() == false) { stop();  return 1; }
		if(frontRightTire.roll() == false) { stop(); return 2; }
		if(backLeftTire.roll() == false) { stop(); return 3; }
		if(backRightTire.roll() == false) { stop(); return 4; }
		return 0;
		*/
		System.out.println("[자동차가 달립니다.]");
		int frontLeftTire1 = frontLeftTire.roll();
		int frontRightTire2 = frontRightTire.roll();
		int backLeftTire3 = backLeftTire.roll();
		int backRightTire4 = backRightTire.roll();
		int sum  = 0;
		
		if(frontLeftTire1 == 1) { sum += 10; }
		if(frontRightTire2 == 2) { sum += 100; }
		if(backLeftTire3 == 3) { sum += 1000; }
		if(backRightTire4 == 4) { sum += 10000; }
		stop();
		return sum;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]"); //펑크 났을 때 실행
	}
	

}
