package sec03.test;

import java.time.LocalDate;

public class BoardExample {

	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();
		
		
		Board board1 = new Board("제목", "내용");
		Board board2 = new Board("제목", "내용", "로그인한 회원아이디");
		Board board3 = new Board("제목", "내용", "로그인한 회원아이디", now);
		Board board4 = new Board("제목", "내용", "로그인한 회원아이디", now, 0);
		
		
	}

}
