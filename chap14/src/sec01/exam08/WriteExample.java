package sec01.exam08;

import java.io.*;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test8.txt");
		//������ �������� test8.txt�� �ϴ� ���� ��� ���� ��� ��Ʈ���� ����
		
		char[] array = {'A', 'B', 'C'};
		
		writer.write(array); //�迭�� ��� ���ڸ� ���
		
		writer.flush(); //��� ���ۿ� �ܷ��ϴ� ��� ���ڸ� ���
		writer.close(); //��� ��Ʈ���� ����
	}

}
