package sec01.exam07;

import java.io.*;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test7.txt");
		//������ �������� test7.txt�� �ϴ� ���� ��� ���� ��� ��Ʈ���� ����
		char a = 'A';
		char b = 'B';
		char c = 'C';
		
		//�� ���ھ� ���
		writer.write(a);
		writer.write(b);
		writer.write(c);
		
		writer.flush(); //��� ���ۿ� �ܷ��ϴ� ��� ���ڸ� ���
		writer.close(); //��� ��Ʈ���� ����
		
	}

}
