package sec01.exam15;

public class StringIndexOfExample {

	public static void main(String[] args) {
		String subject = "�ڹ� ���α׷���";
		
		int location = subject.indexOf("�α׷���");
		System.out.println(location);
		
		System.out.println();
		
		//Ư�� ���ڿ��� ���ԵǾ� �ִ��� ���ο� ���� ���� �ڵ带 �޸��� �� ���� ����.
		//-1���� �����ϸ� Ư�� ���ڿ��� ���ԵǾ� ���� �ʴٴ� ���Դϴ�.
		if(subject.indexOf("�ڹ�") != -1) {
			System.out.println("�ڹٿ� ���õ� å�̱���.");
			
		} else {
			System.out.println("�ڹٿ� ���þ��� å�̱���.");
		}
	}

}
