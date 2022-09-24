package sec01.test.exam07;

import java.util.*;

public class BoardDao {
	
	public List<Board> getBoardList(){
		List<Board> list = new ArrayList<>();
		list.add(new Board("力格1", "郴侩1"));
		list.add(new Board("力格2", "郴侩2"));
		list.add(new Board("力格3", "郴侩3"));
		
		return list; 
	}

}
