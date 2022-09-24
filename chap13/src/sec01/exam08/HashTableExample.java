package sec01.exam08;

import java.util.*;

public class HashTableExample {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("spring", "12"); //���̵�� ��й�ȣ�� �̸� ����
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner scanner = new Scanner(System.in); //Ű����κ��� �Էµ� ������ �ޱ� ���� ����
		
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���.");
			System.out.print("���̵�: ");
			String id = scanner.nextLine(); //Ű����� �Է��� ���̵� ����
			System.out.print("��й�ȣ: ");
			String password = scanner.nextLine(); //Ű����� �Է��� ��й�ȣ�� ����
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("�α��εǾ����ϴ�.");
					break;
				} else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
			} else {
				System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�.");
			}
		}
		
		scanner.close();
	}

}
