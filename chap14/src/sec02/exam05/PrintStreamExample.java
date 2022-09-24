package sec02.exam05;

import java.io.*;

public class PrintStreamExample {

	public static void main(String[] args) throws Exception{
		
		//바이트 기반 출력 스트림을 생성하고 PrintStream 보조 스트림 연결
		FileOutputStream fos = new FileOutputStream("C:/Temp/printstream.txt");
		PrintStream ps = new PrintStream(fos);
		
		//라인 단위로 문자열 출력
		ps.println("[프린터 보조 스트림]");
		ps.print("마치 ");
		ps.println("프린터가 출력하는 것처럼 ");
		ps.println("데이터를 출력합니다.");
		
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
