package sec02.exam03.test;

public class Car {
	//�ʵ�
	Tire frontLeftTire = new Tire("�տ���", 6, 1);
	Tire frontRightTire = new Tire("�տ�����", 2, 2);
	Tire backLeftTire = new Tire("�ڿ���", 3, 3);
	Tire backRightTire = new Tire("�ڿ�����", 4, 4);
	
	//������
	
	//�޼ҵ�
	int run() { 
		/*
		��� Ÿ�̾ 1ȸ ȸ����Ű������ �� Tire��ü�� roll()�޼ҵ带 ȣ��. 
		false�� �����ϴ� roll()�� ���� ��� stop()�޼ҵ带 ȣ���ϰ� �ش� Ÿ�̾��ȣ�� ����
		
		System.out.println("[�ڵ����� �޸��ϴ�.");
		if(frontLeftTire.roll() == false) { stop();  return 1; }
		if(frontRightTire.roll() == false) { stop(); return 2; }
		if(backLeftTire.roll() == false) { stop(); return 3; }
		if(backRightTire.roll() == false) { stop(); return 4; }
		return 0;
		*/
		System.out.println("[�ڵ����� �޸��ϴ�.]");
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
		System.out.println("[�ڵ����� ����ϴ�.]"); //��ũ ���� �� ����
	}
	

}
