package sec01.exam02;

import java.io.*;

public class Write {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test2.db");
		//������ �������� test2.db�� �ϴ� ����Ʈ ��� ���� ��� ��Ʈ���� ����
		
		byte[] array = {40, 50, 60};
		
		os.write(array); //�迭�� ��� ����Ʈ�� ���
		
		os.flush(); //��� ���ۿ� �ܷ��ϴ� ��� ����Ʈ�� ���
		os.close(); //��� ��Ʈ���� ����
		
	}

}
