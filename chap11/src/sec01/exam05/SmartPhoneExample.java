package sec01.exam05;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("����", "�ȵ���̵�");
		
		String strobj = myPhone.toString(); //�����ǵ� toStirng()ȣ��
		System.out.println(strobj);
		
		System.out.println(myPhone); //�����ǵ� toString()�� ȣ���ϰ� ���ϰ��� �޾� ���
	}

}
