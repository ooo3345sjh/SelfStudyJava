package sec01.test.exam07;

import java.util.*;

public class BoardDao {
	
	public List<Board> getBoardList(){
		List<Board> list = new ArrayList<>();
		list.add(new Board("����1", "����1"));
		list.add(new Board("����2", "����2"));
		list.add(new Board("����3", "����3"));
		
		return list; 
	}

}
