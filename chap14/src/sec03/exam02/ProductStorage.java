package sec03.exam02;

import java.util.*;

public class ProductStorage {
	private List<Product> list = new ArrayList<>(); //List 컬렉션 생성
	private Scanner scanner = new Scanner(System.in); //키보드 입력 Scanner생성
	private int counter; //pno 제공 카운터
	
	public void showMenu() {
		while(true) {
			System.out.println("------------------------------------");
			System.out.println("1.등록  |  2.목록  |  3.삭제  |  4.종료");
			System.out.println("------------------------------------");
			System.out.println(list.toString());
			
			System.out.print("선택: ");
			String selectNo = scanner.nextLine(); //번호 읽기
			switch(selectNo) {
				case "1": 
					registerProduct();
					System.out.println();
					break; //Product등록
				case "2": 
					showProducts(); 
					System.out.println();
					break; //등록된 모든 Product 정보 보기
				case "3": 
					deleteProduct(); 
					System.out.println();
					break; //Product등록 삭제
				case "4": 
					System.out.println();
					return; //프로그램 종료
				
			}
		}
	}
	
	public void registerProduct() {
		try {
			Product product = new Product();
			product.setPno(++counter);
			
			System.out.print("상품명: ");
			product.setName(scanner.nextLine()); //이름을 읽고 세팅
			
			System.out.print("가격: ");
			product.setPrice(Integer.parseInt(scanner.nextLine())); //가격을 읽고 세팅
			
			System.out.print("재고: ");
			product.setStock(Integer.parseInt(scanner.nextLine())); //재고를 읽고 세팅
			
			list.add(product); //list에 product저장
			
		} catch(Exception e) {
			System.out.println("등록 에러: " + e.getMessage());
		}
	}
	
	public void deleteProduct() {
		try {
			if(!list.isEmpty()) {
				System.out.print("삭제할 상품명: ");
				String productName = scanner.nextLine();
				for(int i=0; i<list.size(); i++) {
					Product product = list.get(i);
					if(product.getName().equals(productName)) {
						list.remove(i);
					}
				}
	
			} else {
				System.out.println("목록이 비었습니다.");
				return;
			}
			
		} catch (Exception e) {
			System.out.println("삭제 에러: " + e.getMessage());
		}
	}
		
		
		
	
	public void showProducts() {
		System.out.println("순서\t품번\t상품명\t가격\t재고");
		int counter;
		for(int i=0; i<list.size(); i++){
			Product p = list.get(i);
			counter = i+1;
			//list에 저장된 모든 Product 정보를 모니터에 출력
			System.out.println(counter + "\t" + p.getPno() + "\t" + p.getName() + "\t" + p.getPrice() + "\t" + p.getStock()); 
		}
	}

}
