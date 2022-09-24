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
			System.out.println("1.��Ϻ��� | 2.�󼼺��� | 3.�����ϱ� | 4.�����ϱ� | 5.���� ���� | 6.���� �ҷ����� | 7.����");
			System.out.println("------------------------------------------------------------------------------");
			System.out.print("����: ");
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
			System.out.print("����(���� or ���): ");
			String select = scanner.nextLine();
			Board board = new Board();
			
			if(select.equals("���")) {
				board.setNumber(++counter);
				
				System.out.print("����: ");
				board.setTitle(scanner.nextLine());

				System.out.print("�۾���: ");
				board.setWriter(scanner.nextLine());
				
				System.out.print("�ۼ���: ");
				board.setDate(scanner.nextLine());
				
				System.out.print("ī�װ�: ");
				board.setCategory(scanner.nextLine());

				System.out.print("����: ");
				board.setContent(scanner.nextLine());
				
				if(list.isEmpty()) { list.add(board); System.out.println("��ϿϷ�"); } 
				else if(!list.isEmpty()) {
					for(int i=0; i<list.size(); i++) {
						if(!board.equals(list.get(i))) {
							list.add(board);
							System.out.println("��ϿϷ�");
							return;
						} else {
							System.out.println("�ߺ��Ǵ� �ڷᰡ �ֽ��ϴ�.");
						}	
					}
				}	
			} else if(select.equals("����")) {
				if(!list.isEmpty()) {
					System.out.print("Update TitleNumber: ");
					int updateNum1 = Integer.parseInt(scanner.nextLine());
					for(int i=0; i<list.size(); i++) {
						Board board1 = list.get(i);
						if(updateNum1 == board1.getNumber()) {
							while(true) {
								System.out.print("������ �׸�: ");
								String updateNum2 = scanner.nextLine();
								switch(updateNum2) {
									case "title": 
										System.out.print("����: ");
										board1.setTitle(scanner.nextLine());
										break;
									case "writer": 
										System.out.print("�۾���: ");
										board1.setWriter(scanner.nextLine());
										break;
									case "category": 
										System.out.print("ī�װ�: ");
										board1.setCategory(scanner.nextLine());
										break;
									case "date": 
										System.out.print("�ۼ���: ");
										board1.setWriter(scanner.nextLine());
										break;
									case "content": 
										System.out.print("����: ");
										board1.setWriter(scanner.nextLine());
										break;
									case "q":
										return;
										
								}
					
							}
										
						}
							
					}
					
				} else {
					System.out.println("������ �ڷᰡ �����ϴ�.");
				}
				
			}
			
		} catch(Exception e) {
			System.out.println("���� ����: " + e.getMessage());
		}
		
	}
	
	
	public void removeList() {
		if(list.isEmpty()) { System.out.println("������ �ڷᰡ �����ϴ�."); return;}
		System.out.println("������ �ڷ� ��ȣ�� �Է����ּ���.: ");
		int titleNum = Integer.parseInt(scanner.nextLine());
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			if(titleNum == board.getNumber()) {
				list.remove(i);
				System.out.println("�����Ϸ�");
				return;
			}
		}
	}
	
	public void ShowList() {
		if(list.isEmpty()) {System.out.println("�ڷᰡ ����ֽ��ϴ�."); return;}
		System.out.println("NO.\t����\t�۾���\tī���ڸ�\t�ۼ���");
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.getNumber() + "\t" + board.getTitle() + "\t" + board.getWriter() 
			+ "\t" + board.getCategory() + "\t" + board.getDate());	
		}
	}
	
	public void detailsView() {
		if(list.isEmpty()) {System.out.println("�ڷᰡ ����ֽ��ϴ�."); return;}
		System.out.print("�ڷ� ����: ");
		int titleNum = Integer.parseInt(scanner.nextLine());
		
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			if(titleNum == board.getNumber()) {
				System.out.println("NO.: " + board.getNumber() + "\t����: " + board.getTitle() + "\t�۾���: " + 
			board.getWriter() + "\tī���ڸ�: " + board.getCategory() + "\t�ۼ��� : " + board.getDate());
				System.out.println("����: " + board.getContent());
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
			System.out.println("���� �Ϸ�");
		} catch(Exception e) {
			System.out.println("���� ����: " + e.getMessage());
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public void openFile() {
		try {
			FileInputStream fis = new FileInputStream("C:/Temp/title.db");
			ObjectInputStream ois = new ObjectInputStream(fis);
			list = (List<Board>)ois.readObject();
			ois.close();
			System.out.println("�ҷ����� �Ϸ�");
		} catch(Exception e) {
			System.out.println("�ҷ����� ����: " + e.getMessage());
		}
		
	}
	
	public void stopService() {
		System.out.println("���α׷��� �����մϴ�.");
		return;
		
	}

	
}
