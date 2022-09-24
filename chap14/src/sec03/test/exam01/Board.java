package sec03.test.exam01;

import java.io.*;

@SuppressWarnings("serial")
public class Board implements Serializable{
	private int number;
	private String title;
	private String writer;
	private String date;
	private String category;
	private String content;
	

	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "제목: " + title + "글쓴이: " + writer;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Board) {
			Board board = (Board) obj;
			if(board.getNumber() == number) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return getNumber();
	}
	
	
}
