package sec01.exam13;

import java.io.*;

public class ReadExample {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test9.txt"); 
		//������ ������� test9.txt�� �ϴ� ���� ��� ���� �Է� ��Ʈ���� ����
		
		char[] buffer = new char[5];
		
		int readCharNum = reader.read(buffer, 2, 3); 
		//�Է� ��Ʈ�����κ��� 3���� ���ڸ� �а� buffer[2], buffer[3], buffer[4]�� ���� ����
		if(readCharNum != -1) { //���� ���ڰ� �ִٸ�
			for(int i=0; i<buffer.length; i++) {
				System.out.println(buffer[i]); //�迭 ��ü�� �а� ���
			}
		}
		
		reader.close(); //�Է� ��Ʈ���� ����
	}

}
