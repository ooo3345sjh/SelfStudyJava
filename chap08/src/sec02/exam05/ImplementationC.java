package sec02.exam05;

public class ImplementationC implements InterfaceC {

	//InterfaceA�� InterfaceB�� ��ü �޼ҵ嵵 �־����
	
	@Override 
	public void methodA() {
		System.out.println("ImplamentationC-methodA() ����");
	}

	@Override
	public void methodB() {
		System.out.println("ImplemaentationC-methodB() ����");
	}

	@Override
	public void methodC() {
		System.out.println("ImplemaentationC-methodC() ����");		
	}
	

}
