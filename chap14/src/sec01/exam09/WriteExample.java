package sec01.exam09;

import java.io.*;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test9.txt");  
		 //������ �������� test9.txt�� �ϴ� ���� ��� ���� ��� ��Ʈ���� �ϼ�
		
		char[] array = {'A', 'B', 'C', 'D', 'E'}; 
		
		writer.write(array, 1, 3); //�迭�� 1�� �ε������� 3���� ���
		
		writer.flush(); //��� ���ۿ� �ܷ��ϴ� ��� ���ڸ� ���
		writer.close(); //��� ��Ʈ�� ����.
		
	}

}
