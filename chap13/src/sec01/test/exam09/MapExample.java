package sec01.test.exam09;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null; //�ְ� ������ ���� ���̵� ����
		int maxScore = 0;   //�ְ� ���� ����
		int totalScore = 0; //���� �հ� ����
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> element = entryIterator.next();
			totalScore += element.getValue();
			if(maxScore < element.getValue()) {
				name = element.getKey();
				maxScore = element.getValue();
			}
		}
		
		int avgScore = totalScore/map.size();
		
		System.out.println("�������: " + avgScore);
		System.out.println("�ְ�����: " + maxScore);
		System.out.println("�ְ������� ���� ���̵�: " + name);
	}

}
