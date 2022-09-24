package sec01.exam04;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("JAVA");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("�� ��ü��: " + size);
		
		Iterator<String> iterator = set.iterator(); //�ݺ��� ���
		while(iterator.hasNext()) {                 //��ü ����ū ����
			String element = iterator.next();       //1���� ��ü�� ������
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");     //1���� ��ü ����
		set.remove("iBATIS");   //1���� ��ü ����
		
		System.out.println("�� ��ü��: " + set.size()); //����� ��ü �� ���
		iterator = set.iterator(); //�ݺ��� ���
		for(String element : set) {  //��ü ����ŭ ����
			System.out.println("\t" + element);   
		}
		
		set.clear(); //��� ��ü�� �����ϰ� ���
		if(set.isEmpty()) {System.out.println("��� ����");}
		
	}

}
