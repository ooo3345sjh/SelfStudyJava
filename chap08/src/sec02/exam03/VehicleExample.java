package sec02.exam03;

public class VehicleExample {

	public static void main(String[] args) {
		
		Vehicle vehicle1 = new Bus();
		Vehicle vehicle2 = new Taxi();
		
		vehicle1.run();
		//vehicle.checkFare();  Vehicle 인터페이스에는 checFare()가 없음
		
		Bus bus1 = (Bus) vehicle1; //강제 타입 변환
		//Bus bus2 = (Bus) vehicle2; //ClassCastException
		
		bus1.run();
		bus1.checkFare(); //Bus 클래스에는 checFare()있음
		
	}

}
