package sec02.exam03;

public class Driver {
	public void drive(Vehicle vehicle) { //Bus��ü, Taxi��ü
		if(vehicle instanceof Bus) { //vehicle �Ű� ������ �����ϴ� ��ü�� Bus���� ����
			Bus bus = (Bus) vehicle; //Bus��ü�� ��� �����ϰ� ���� Ÿ�� ��ȯ
			bus.checkFare();         //BusŸ������ ���� Ÿ�� ��ȯ�� �ϴ� ����
		}
		vehicle.run();
	}
}