package sec02.exam03.test;

public class KumhoTire extends Tire {
	//�ʵ�
	
		//������
		public KumhoTire(String location, int maxRotation, int locationNum) {
			super(location, maxRotation, locationNum);
		}
		
		//�޼ҵ�
		@Override //�ٸ� ������ ����ϱ� ���� �������� roll()�޼ҵ�
		public int roll() {
			++accumulatedRotation;
			if(accumulatedRotation < maxRotation) {
				System.out.println(location + " KumhoTire ����: " + 
			(maxRotation-accumulatedRotation) + "ȸ");
				return 0;
			} else {
				System.out.println("*** " + location + " KumhoTire ��ũ ***");
				return locationNum;
			}
		}
	}
