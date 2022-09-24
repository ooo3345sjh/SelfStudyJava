package sec02.exam03.test;

public class Tire {
	//�ʵ�
	public int maxRotation;          //�ִ� ȸ����(Ÿ�̾� ����)
	public int accumulatedRotation;  //���� ȸ����
	public String location;          //Ÿ�̾��� ��ġ
	public int locationNum;          //Ÿ�̾��� ��ġ �ѹ�
	
	//������
	public Tire(String location, int maxRotation, int locationNum) {
		this.location = location;
		this.maxRotation = maxRotation;
		this.locationNum = locationNum;
	}
	
	//�޼ҵ�
	public int roll() {
		++accumulatedRotation; //���� ȸ���� 1 ����
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire ����: " 
		+ (maxRotation-accumulatedRotation) + "ȸ"); //���� ȸ��(����<�ִ�)�� ��� ����
			return 0;
		} else {
			System.out.println("*** " + location + " Trie ��ũ ***"); //��ũ(����=�ִ�)�� ��� ����
			return locationNum;
		}
	}
}
