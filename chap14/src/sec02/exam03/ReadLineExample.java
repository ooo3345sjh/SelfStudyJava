package sec02.exam03;

import java.io.*;

public class ReadLineExample {

	public static void main(String[] args) throws Exception {
		//���� ��� �Է� ��Ʈ�� ���
		InputStream reader = new FileInputStream(
				ReadLineExample.class.getResource("language.txt").getPath()
				);
		BufferedReader br = new BufferedReader(new InputStreamReader(reader, "UTF-8")); //BufferedReader ���� ��Ʈ�� ����
		
		
		while(true) {
			String data = br.readLine(); //���� ���� ���ڿ��� �а� ����
			if(data == null) break; //���� ���� �������� ���
			System.out.println(data);
		}
		
		br.close(); //�Է� ��Ʈ�� �ݱ�
	}

}
