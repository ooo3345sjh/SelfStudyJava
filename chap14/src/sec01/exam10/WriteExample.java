package sec01.exam10;

import java.io.*;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test10.txt");
		//������ �������� test10.txt�� �ϴ� ���� ��� ���� ��� ��Ʈ���� ����
		String str1 = "ABC";
		String str2 = "ABCDE";
		
		writer.write(str1); //���ڿ� ��ü�� ���
		writer.write(str2, 3, 2); //���ڿ� ��ü�� ���
		
		writer.flush(); //��� ���ۿ� �ܷ��ϴ� ��� ���ڿ��� ���
		writer.close(); //��� ��Ʈ���� ����
		
	}

}
