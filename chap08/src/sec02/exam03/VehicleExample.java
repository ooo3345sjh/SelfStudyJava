package sec02.exam03;

public class VehicleExample {

	public static void main(String[] args) {
		
		Vehicle vehicle1 = new Bus();
		Vehicle vehicle2 = new Taxi();
		
		vehicle1.run();
		//vehicle.checkFare();  Vehicle �������̽����� checFare()�� ����
		
		Bus bus1 = (Bus) vehicle1; //���� Ÿ�� ��ȯ
		//Bus bus2 = (Bus) vehicle2; //ClassCastException
		
		bus1.run();
		bus1.checkFare(); //Bus Ŭ�������� checFare()����
		
	}

}
