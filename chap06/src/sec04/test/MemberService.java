package sec04.test;

public class MemberService {
	 boolean login(String name, String id) {
		 if(name.equals("hong") && id.equals("12345")) {
			 return true;
		 } else {
			 return false;
		 }
	 }
	 
	 void logout(String id) {
		 System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	 }
}
