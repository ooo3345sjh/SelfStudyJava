package sec01.exam05;

import java.io.*;

public class ReadExample {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/Test2.db");
		//������ ������� test2.db�� �ϴ� ����Ʈ ��� ���� �Է� ��Ʈ���� ����
		
		byte[] buffer = new byte[2]; //���� 100�� �迭 ����
		
		while(true) {
			int readByteNum = is.read(buffer); //�迭 ���̸�ŭ �б�
			if(readByteNum == -1) break; //���� ���� �������� ���
			for(int i=0; i<readByteNum; i++) {
				System.out.println(buffer[i]); //���� ����Ʈ ����ŭ �ݺ��ϸ鼭 �迭�� ����� ����Ʈ�� ���
			}
		}
		
		is.close();
		
	}

}
