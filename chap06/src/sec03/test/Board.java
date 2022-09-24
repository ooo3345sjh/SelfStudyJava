package sec03.test;

import java.time.LocalDate;

public class Board {
	String title;
	String content;
	String writer;
	LocalDate date;
	int hitcount;
	
	Board(String title, String content){
		this(title, content, "로그인한 회원아이디", LocalDate.now(), 0);
	}
	
	Board(String title, String content, String writer){
		this(title, content, writer, LocalDate.now(), 0);
		
	}
	
	Board(String title, String content, String writer, LocalDate date){
		this(title, content, writer, date, 0);
	}
	
	Board(String title, String content, String writer, LocalDate date, int hitcount){
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
	}

}
