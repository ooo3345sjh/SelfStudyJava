package sec02.exam03.test;

public class HankookTire extends Tire {
	//�ʵ�
	
	//������
	public HankookTire(String location, int maxRotation, int locationNum) {
		super(location, maxRotation, locationNum);
	}
	
	//�޼ҵ�
	@Override //�ٸ� ������ ����ϱ� ���� �������� roll()�޼ҵ�
	public int roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire ����: " + 
		(maxRotation-accumulatedRotation) + "ȸ");
			return 0;
		} else {
			System.out.println("*** " + location + " HankookTire ��ũ ***");
			return locationNum;
		}
	}
}
