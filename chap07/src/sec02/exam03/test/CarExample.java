package sec02.exam03.test;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car(); //Car��ü ����
		
		for(int i=1; i<=7; i++) {
			int problemLocation = car.run(); //Car��ü�� run()�޼ҵ� 5�� �ݺ� ����
			
			switch(problemLocation) {
				case 10: 
					// ���� Ÿ�̾ ��ũ���� �� HankookTire�� ��ü
					System.out.println("�տ��� HankookTire�� ��ü");
					car.frontLeftTire = new HankookTire("�տ���", 15, 1);
					break;
				case 100: 
					//�տ����� Ÿ�̾ ��ũ ���� �� KumhoTire�� ��ü
					System.out.println("�տ����� KumhoTire�� ��ü");
					car.frontRightTire = new KumhoTire("�տ�����", 13, 2);
					break;
				case 110: 
					//�տ��� Ÿ�̾ ��ũ���� �� HankookTire�� ��ü
					System.out.println("�տ��� HankookTire�� ��ü");
					car.frontLeftTire = new HankookTire("�տ���", 15, 1);
					
					//�տ����� Ÿ�̾ ��ũ ���� �� KumhoTire�� ��ü
					System.out.println("�տ����� KumhoTire�� ��ü");
					car.frontRightTire = new KumhoTire("�տ�����", 13, 2);
					break;
				case 1000://�ڿ��� Ÿ�̾ ��ũ ���� �� HankookTire�� ��ü
					System.out.println("�ڿ��� HankookTire�� ��ü");
					car.backLeftTire = new HankookTire("�ڿ���", 14, 3);
					break;
				case 1010:
					// �տ��� Ÿ�̾ ��ũ���� �� HankookTire�� ��ü
					System.out.println("�տ��� HankookTire�� ��ü");
					car.frontLeftTire = new HankookTire("�տ���", 15, 1);
					
					//�ڿ��� Ÿ�̾ ��ũ ���� �� HankookTire�� ��ü
					System.out.println("�ڿ��� HankookTire�� ��ü");
					car.backLeftTire = new HankookTire("�ڿ���", 14, 3);
					break;
				case 1100:
					//�տ����� Ÿ�̾ ��ũ ���� �� KumhoTire�� ��ü
					System.out.println("�տ����� KumhoTire�� ��ü");
					car.frontRightTire = new KumhoTire("�տ�����", 13, 2);
					
					//�ڿ��� Ÿ�̾ ��ũ ���� �� HankookTire�� ��ü
					System.out.println("�ڿ��� HankookTire�� ��ü");
					car.backLeftTire = new HankookTire("�ڿ���", 14, 3);
					break;
				case 1110:
					// �տ��� Ÿ�̾ ��ũ���� �� HankookTire�� ��ü
					System.out.println("�տ��� HankookTire�� ��ü");
					car.frontLeftTire = new HankookTire("�տ���", 15, 1);
					
					//�տ����� Ÿ�̾ ��ũ ���� �� KumhoTire�� ��ü
					System.out.println("�տ����� KumhoTire�� ��ü");
					car.frontRightTire = new KumhoTire("�տ�����", 13, 2);
					
					//�ڿ��� Ÿ�̾ ��ũ ���� �� HankookTire�� ��ü
					System.out.println("�ڿ��� HankookTire�� ��ü");
					car.backLeftTire = new HankookTire("�ڿ���", 14, 3);
					break;
				case 10000://�ڿ����� Ÿ�̾ ��ũ ���� �� KumhoTire�� ��ü
					System.out.println("�ڿ����� HankookTire�� ��ü");
					car.backRightTire = new HankookTire("�ڿ�����", 17, 4);
					break;
				case 10010:
					// �տ��� Ÿ�̾ ��ũ���� �� HankookTire�� ��ü
					System.out.println("�տ��� HankookTire�� ��ü");
					car.frontLeftTire = new HankookTire("�տ���", 15, 1);
					
					//�ڿ����� Ÿ�̾ ��ũ ���� �� KumhoTire�� ��ü
					System.out.println("�ڿ����� HankookTire�� ��ü");
					car.backRightTire = new HankookTire("�ڿ�����", 17, 4);
					break;
				case 10100:
					//�տ����� Ÿ�̾ ��ũ ���� �� KumhoTire�� ��ü
					System.out.println("�տ����� KumhoTire�� ��ü");
					car.frontRightTire = new KumhoTire("�տ�����", 13, 2);
					
					//�ڿ����� Ÿ�̾ ��ũ ���� �� KumhoTire�� ��ü
					System.out.println("�ڿ����� HankookTire�� ��ü");
					car.backRightTire = new HankookTire("�ڿ�����", 17, 4);
					break;
				case 10110:
					// �տ��� Ÿ�̾ ��ũ���� �� HankookTire�� ��ü
					System.out.println("�տ��� HankookTire�� ��ü");
					car.frontLeftTire = new HankookTire("�տ���", 15, 1);
					
					//�տ����� Ÿ�̾ ��ũ ���� �� KumhoTire�� ��ü
					System.out.println("�տ����� KumhoTire�� ��ü");
					car.frontRightTire = new KumhoTire("�տ�����", 13, 2);
					
					//�ڿ����� Ÿ�̾ ��ũ ���� �� KumhoTire�� ��ü
					System.out.println("�ڿ����� HankookTire�� ��ü");
					car.backRightTire = new HankookTire("�ڿ�����", 17, 4);
					break;
				case 11000:
					//�ڿ��� Ÿ�̾ ��ũ ���� �� HankookTire�� ��ü
					System.out.println("�ڿ��� HankookTire�� ��ü");
					car.backLeftTire = new HankookTire("�ڿ���", 14, 3);
					
					//�ڿ����� Ÿ�̾ ��ũ ���� �� KumhoTire�� ��ü
					System.out.println("�ڿ����� HankookTire�� ��ü");
					car.backRightTire = new HankookTire("�ڿ�����", 17, 4);
					break;
				case 11010:
					// �տ��� Ÿ�̾ ��ũ���� �� HankookTire�� ��ü
					System.out.println("�տ��� HankookTire�� ��ü");
					car.frontLeftTire = new HankookTire("�տ���", 15, 1);
					
					//�ڿ��� Ÿ�̾ ��ũ ���� �� HankookTire�� ��ü
					System.out.println("�ڿ��� HankookTire�� ��ü");
					car.backLeftTire = new HankookTire("�ڿ���", 14, 3);
					
					//�ڿ����� Ÿ�̾ ��ũ ���� �� KumhoTire�� ��ü
					System.out.println("�ڿ����� HankookTire�� ��ü");
					car.backRightTire = new HankookTire("�ڿ�����", 17, 4);
					break;
				case 11100:
					//�տ����� Ÿ�̾ ��ũ ���� �� KumhoTire�� ��ü
					System.out.println("�տ����� KumhoTire�� ��ü");
					car.frontRightTire = new KumhoTire("�տ�����", 13, 2);
					
					//�ڿ��� Ÿ�̾ ��ũ ���� �� HankookTire�� ��ü
					System.out.println("�ڿ��� HankookTire�� ��ü");
					car.backLeftTire = new HankookTire("�ڿ���", 14, 3);
					
					//�ڿ����� Ÿ�̾ ��ũ ���� �� KumhoTire�� ��ü
					System.out.println("�ڿ����� HankookTire�� ��ü");
					car.backRightTire = new HankookTire("�ڿ�����", 17, 4);
					break;
				case 11110:
					// �տ��� Ÿ�̾ ��ũ���� �� HankookTire�� ��ü
					System.out.println("�տ��� HankookTire�� ��ü");
					car.frontLeftTire = new HankookTire("�տ���", 15, 1);
					
					//�տ����� Ÿ�̾ ��ũ ���� �� KumhoTire�� ��ü
					System.out.println("�տ����� KumhoTire�� ��ü");
					car.frontRightTire = new KumhoTire("�տ�����", 13, 2);
					
					//�ڿ��� Ÿ�̾ ��ũ ���� �� HankookTire�� ��ü
					System.out.println("�ڿ��� HankookTire�� ��ü");
					car.backLeftTire = new HankookTire("�ڿ���", 14, 3);
					
					//�ڿ����� Ÿ�̾ ��ũ ���� �� KumhoTire�� ��ü
					System.out.println("�ڿ����� HankookTire�� ��ü");
					car.backRightTire = new HankookTire("�ڿ�����", 17, 4);
					break;
					
			}
			System.out.println("----------------------------------");
		}
	}

}
