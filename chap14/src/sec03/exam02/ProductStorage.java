package sec03.exam02;

import java.util.*;

public class ProductStorage {
	private List<Product> list = new ArrayList<>(); //List �÷��� ����
	private Scanner scanner = new Scanner(System.in); //Ű���� �Է� Scanner����
	private int counter; //pno ���� ī����
	
	public void showMenu() {
		while(true) {
			System.out.println("------------------------------------");
			System.out.println("1.���  |  2.���  |  3.����  |  4.����");
			System.out.println("------------------------------------");
			System.out.println(list.toString());
			
			System.out.print("����: ");
			String selectNo = scanner.nextLine(); //��ȣ �б�
			switch(selectNo) {
				case "1": 
					registerProduct();
					System.out.println();
					break; //Product���
				case "2": 
					showProducts(); 
					System.out.println();
					break; //��ϵ� ��� Product ���� ����
				case "3": 
					deleteProduct(); 
					System.out.println();
					break; //Product��� ����
				case "4": 
					System.out.println();
					return; //���α׷� ����
				
			}
		}
	}
	
	public void registerProduct() {
		try {
			Product product = new Product();
			product.setPno(++counter);
			
			System.out.print("��ǰ��: ");
			product.setName(scanner.nextLine()); //�̸��� �а� ����
			
			System.out.print("����: ");
			product.setPrice(Integer.parseInt(scanner.nextLine())); //������ �а� ����
			
			System.out.print("���: ");
			product.setStock(Integer.parseInt(scanner.nextLine())); //��� �а� ����
			
			list.add(product); //list�� product����
			
		} catch(Exception e) {
			System.out.println("��� ����: " + e.getMessage());
		}
	}
	
	public void deleteProduct() {
		try {
			if(!list.isEmpty()) {
				System.out.print("������ ��ǰ��: ");
				String productName = scanner.nextLine();
				for(int i=0; i<list.size(); i++) {
					Product product = list.get(i);
					if(product.getName().equals(productName)) {
						list.remove(i);
					}
				}
	
			} else {
				System.out.println("����� ������ϴ�.");
				return;
			}
			
		} catch (Exception e) {
			System.out.println("���� ����: " + e.getMessage());
		}
	}
		
		
		
	
	public void showProducts() {
		System.out.println("����\tǰ��\t��ǰ��\t����\t���");
		int counter;
		for(int i=0; i<list.size(); i++){
			Product p = list.get(i);
			counter = i+1;
			//list�� ����� ��� Product ������ ����Ϳ� ���
			System.out.println(counter + "\t" + p.getPno() + "\t" + p.getName() + "\t" + p.getPrice() + "\t" + p.getStock()); 
		}
	}

}
