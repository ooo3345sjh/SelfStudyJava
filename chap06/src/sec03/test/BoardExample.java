package sec03.test;

import java.time.LocalDate;

public class BoardExample {

	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();
		
		
		Board board1 = new Board("����", "����");
		Board board2 = new Board("����", "����", "�α����� ȸ�����̵�");
		Board board3 = new Board("����", "����", "�α����� ȸ�����̵�", now);
		Board board4 = new Board("����", "����", "�α����� ȸ�����̵�", now, 0);
		
		
	}

}
