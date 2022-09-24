package sec02.exam01;

import java.io.*;

public class CharacterConvertStreamExample {

	public static void main(String[] args) throws Exception {
		write("���� ��ȯ ��Ʈ���� ����մϴ�.");
		String data = read();
		System.out.println(data);
	}
	
	public static void write(String str) throws Exception {
		//FileOutputStream�� OutputStreamWriter ���� ��Ʈ���� ����
		FileOutputStream fos = new FileOutputStream("C:/Temp/test1.txt");
		Writer writer = new OutputStreamWriter(fos);
		
		//OutputStreamWriter ���� ��Ʈ���� �̿��ؼ� ���� ���
		writer.write(str);
		writer.flush();
		
		writer.close();
	}
	
	public static String read() throws Exception {
		//FileInputStream�� InputStreamReader ���� ��Ʈ���� ����
		FileInputStream fis = new FileInputStream("C:/Temp/test1.txt");
		Reader reader = new InputStreamReader(fis);
		char[] buffer = new char[100];
		//InputStreamReader ���� ��Ʈ���� �̿��ؼ� ���� �Է�
		int readCharNum = reader.read(buffer);
		reader.close();
		//char�迭���� ���� ����ŭ ���ڿ��� ��ȯ
		String data = new String(buffer, 0, readCharNum);
		return data;
	}

}
