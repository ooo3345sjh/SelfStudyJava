package sec02.exam03;

public class Driver {
	public void drive(Vehicle vehicle) { //Bus객체, Taxi객체
		if(vehicle instanceof Bus) { //vehicle 매개 변수가 참조하는 객체가 Bus인지 조사
			Bus bus = (Bus) vehicle; //Bus객체일 경우 안전하게 강제 타입 변환
			bus.checkFare();         //Bus타입으로 강제 타입 변환을 하는 이유
		}
		vehicle.run();
	}
}