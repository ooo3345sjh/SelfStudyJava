package sec01.exam12;

import java.io.*;

public class ReadExample {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test8.txt");
		
		char[] buffer = new char[2]; //���� 100�� �迭 ����
		
		while(true) {
			int readCharNum = reader.read(buffer); //�迭 ���̸�ŭ �б�
			if(readCharNum == -1) break; //���� ���� �������� ���
			for(int i=0; i<readCharNum; i++) { //���� ���� ����ŭ �ݺ��ϸ鼭 �迭�� ����� ���ڸ� ���
				System.out.println(buffer[i]);
			}
		}
		
		reader.close(); //�Է� ��Ʈ���� ����
	}

}
