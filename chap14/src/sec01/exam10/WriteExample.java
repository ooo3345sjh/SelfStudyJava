package sec01.exam10;

import java.io.*;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test10.txt");
		//데이터 도착지를 test10.txt로 하는 문자 기반 파일 출력 스트림을 생성
		String str1 = "ABC";
		String str2 = "ABCDE";
		
		writer.write(str1); //문자열 전체를 출력
		writer.write(str2, 3, 2); //문자열 전체를 출력
		
		writer.flush(); //출력 버퍼에 잔류하는 모든 문자열을 출력
		writer.close(); //출력 스트림을 닫음
		
	}

}
