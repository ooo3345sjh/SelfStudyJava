package sec02.test.exam05;

class Service {
	public void login() {
		System.out.println("�α���");
	}
}

class MemberService extends Service{
	public void login() {
		System.out.println("��� �α���");
	}
}

class AService extends MemberService{
	public void login() {
		System.out.println("A �α���");
	}
}

public class ServiceExample{
	public static void main(String[] args) {
		Controller controller = new Controller();
		
		controller.setService(new MemberService());
		controller.service.login();
		
		
		controller.setService(new AService());
		controller.service.login();
	}
}



