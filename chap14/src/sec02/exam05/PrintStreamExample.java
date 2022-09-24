package sec02.exam05;

import java.io.*;

public class PrintStreamExample {

	public static void main(String[] args) throws Exception{
		
		//����Ʈ ��� ��� ��Ʈ���� �����ϰ� PrintStream ���� ��Ʈ�� ����
		FileOutputStream fos = new FileOutputStream("C:/Temp/printstream.txt");
		PrintStream ps = new PrintStream(fos);
		
		//���� ������ ���ڿ� ���
		ps.println("[������ ���� ��Ʈ��]");
		ps.print("��ġ ");
		ps.println("�����Ͱ� ����ϴ� ��ó�� ");
		ps.println("�����͸� ����մϴ�.");
		
		ps.flush();
		ps.close();
		
		FileInputStream fis = new FileInputStream("C:/Temp/printstream.txt");
		BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
		
		while(true) {
			String str = reader.readLine();
			if(str == null) break;
			System.out.println(str);
		}
		
		reader.close();
	}

}
