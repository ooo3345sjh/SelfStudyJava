package sec02.exam06;

import java.io.*;
import java.text.*;
import java.util.*;

public class ObjectStreamExample {

	public static void main(String[] args) throws Exception {
		writeList(); //List를 파일에 저장
		List<Board> list = readList(); //파일에 저장된 List읽기
		
		
		//list 내용을 모니터에 출력
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		for(Board board : list) {
			System.out.println(
				board.getBno() + "\t" + board.getTitle() + "\t" + board.getContent() + "\t" + 
				board.getWriter() + "\t" + sdf.format(board.getDate()))
			;
		}
		
	}
	
	
	public static void writeList() throws Exception {
		List<Board> list = new ArrayList<>(); //List생성
		
		//list에 Board 객체 저장
		list.add(new Board(1, "제목1", "내용1", "글쓴이1", new Date()));
		list.add(new Board(2, "제목2", "내용2", "글쓴이2", new Date()));
		list.add(new Board(3, "제목3", "내용3", "글쓴이3", new Date()));
		
		//객체 출력 스트림을 이용해서 list출력
		FileOutputStream fos = new FileOutputStream("C:/Temp/board.db");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.flush();
		oos.close();
	}
	
	//객체 입력 스트림을 이용해서 list읽기
	public static List<Board> readList() throws Exception {
		FileInputStream fis = new FileInputStream("C:/Temp/board.db");
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		List<Board> list = (List<Board>) ois.readObject();
		
		ois.close();
		return list;
	}

}


