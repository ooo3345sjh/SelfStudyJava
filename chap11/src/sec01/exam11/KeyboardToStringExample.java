package sec01.exam11;

import java.io.*;

public class KeyboardToStringExample {

	public static void main(String[] args) throws Exception {
		byte[] bytes = new byte[100]; //���� ����Ʈ�� �����ϱ� ���� �迭 ����
		
		System.out.print("�Է�: ");
		int readByteNo = System.in.read(bytes);
		
		String str = new String(bytes, 0, readByteNo-2);
		System.out.println(str);
	}

}
