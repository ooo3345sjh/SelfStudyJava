package sec02.exam03;

import java.io.*;

public class ReadLineExample {

	public static void main(String[] args) throws Exception {
		//문자 기반 입력 스트림 얻기
		InputStream reader = new FileInputStream(
				ReadLineExample.class.getResource("language.txt").getPath()
				);
		BufferedReader br = new BufferedReader(new InputStreamReader(reader, "UTF-8")); //BufferedReader 보조 스트림 연결
		
		
		while(true) {
			String data = br.readLine(); //라인 단위 문자열을 읽고 리턴
			if(data == null) break; //파일 끝에 도달했을 경우
			System.out.println(data);
		}
		
		br.close(); //입력 스트림 닫기
	}

}
