package sec03.test.exam01;

import java.io.*;
import java.util.*;

public class BoardService {
	List<Board> list = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	int counter = 0;
	
	public void showMenu() {
		while(true) {
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("1.목록보기 | 2.상세보기 | 3.수정하기 | 4.삭제하기 | 5.파일 저장 | 6.파일 불러오기 | 7.종료");
			System.out.println("------------------------------------------------------------------------------");
			System.out.print("선택: ");
			String selectNo = scanner.nextLine();
			switch(selectNo) {
				case "1": ShowList(); break;
				case "2": detailsView(); break;
				case "3": updateFile(); break;
				case "4": removeList(); break;
				case "5": saveFile(); break;
				case "6": openFile(); break;
				case "7": stopService(); return;
			}
		}
	}
		
	public void updateFile() {
		try {
			System.out.print("선택(수정 or 등록): ");
			String select = scanner.nextLine();
			Board board = new Board();
			
			if(select.equals("등록")) {
				board.setNumber(++counter);
				
				System.out.print("제목: ");
				board.setTitle(scanner.nextLine());

				System.out.print("글쓴이: ");
				board.setWriter(scanner.nextLine());
				
				System.out.print("작성일: ");
				board.setDate(scanner.nextLine());
				
				System.out.print("카테고리: ");
				board.setCategory(scanner.nextLine());

				System.out.print("내용: ");
				board.setContent(scanner.nextLine());
				
				if(list.isEmpty()) { list.add(board); System.out.println("등록완료"); } 
				else if(!list.isEmpty()) {
					for(int i=0; i<list.size(); i++) {
						if(!board.equals(list.get(i))) {
							list.add(board);
							System.out.println("등록완료");
							return;
						} else {
							System.out.println("중복되는 자료가 있습니다.");
						}	
					}
				}	
			} else if(select.equals("수정")) {
				if(!list.isEmpty()) {
					System.out.print("Update TitleNumber: ");
					int updateNum1 = Integer.parseInt(scanner.nextLine());
					for(int i=0; i<list.size(); i++) {
						Board board1 = list.get(i);
						if(updateNum1 == board1.getNumber()) {
							while(true) {
								System.out.print("수정할 항목: ");
								String updateNum2 = scanner.nextLine();
								switch(updateNum2) {
									case "title": 
										System.out.print("제목: ");
										board1.setTitle(scanner.nextLine());
										break;
									case "writer": 
										System.out.print("글쓴이: ");
										board1.setWriter(scanner.nextLine());
										break;
									case "category": 
										System.out.print("카테고리: ");
										board1.setCategory(scanner.nextLine());
										break;
									case "date": 
										System.out.print("작성일: ");
										board1.setWriter(scanner.nextLine());
										break;
									case "content": 
										System.out.print("내용: ");
										board1.setWriter(scanner.nextLine());
										break;
									case "q":
										return;
										
								}
					
							}
										
						}
							
					}
					
				} else {
					System.out.println("수정할 자료가 없습니다.");
				}
				
			}
			
		} catch(Exception e) {
			System.out.println("저장 에러: " + e.getMessage());
		}
		
	}
	
	
	public void removeList() {
		if(list.isEmpty()) { System.out.println("삭제할 자료가 없습니다."); return;}
		System.out.println("삭제할 자료 번호를 입력해주세요.: ");
		int titleNum = Integer.parseInt(scanner.nextLine());
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			if(titleNum == board.getNumber()) {
				list.remove(i);
				System.out.println("삭제완료");
				return;
			}
		}
	}
	
	public void ShowList() {
		if(list.isEmpty()) {System.out.println("자료가 비어있습니다."); return;}
		System.out.println("NO.\t제목\t글쓴이\t카테코리\t작성일");
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.getNumber() + "\t" + board.getTitle() + "\t" + board.getWriter() 
			+ "\t" + board.getCategory() + "\t" + board.getDate());	
		}
	}
	
	public void detailsView() {
		if(list.isEmpty()) {System.out.println("자료가 비어있습니다."); return;}
		System.out.print("자료 선택: ");
		int titleNum = Integer.parseInt(scanner.nextLine());
		
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			if(titleNum == board.getNumber()) {
				System.out.println("NO.: " + board.getNumber() + "\t제목: " + board.getTitle() + "\t글쓴이: " + 
			board.getWriter() + "\t카테코리: " + board.getCategory() + "\t작성일 : " + board.getDate());
				System.out.println("내용: " + board.getContent());
			}
		}
	}
	
	public void saveFile() {
		try {
			FileOutputStream fos = new FileOutputStream("C:/Temp/title.db");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
			oos.flush();
			oos.close();
			System.out.println("저장 완료");
		} catch(Exception e) {
			System.out.println("저장 오류: " + e.getMessage());
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public void openFile() {
		try {
			FileInputStream fis = new FileInputStream("C:/Temp/title.db");
			ObjectInputStream ois = new ObjectInputStream(fis);
			list = (List<Board>)ois.readObject();
			ois.close();
			System.out.println("불러오기 완료");
		} catch(Exception e) {
			System.out.println("불러오기 오류: " + e.getMessage());
		}
		
	}
	
	public void stopService() {
		System.out.println("프로그램을 종료합니다.");
		return;
		
	}

	
}
