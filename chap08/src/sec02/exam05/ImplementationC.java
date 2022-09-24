package sec02.exam05;

public class ImplementationC implements InterfaceC {

	//InterfaceA와 InterfaceB의 실체 메소드도 있어야함
	
	@Override 
	public void methodA() {
		System.out.println("ImplamentationC-methodA() 실행");
	}

	@Override
	public void methodB() {
		System.out.println("ImplemaentationC-methodB() 실행");
	}

	@Override
	public void methodC() {
		System.out.println("ImplemaentationC-methodC() 실행");		
	}
	

}
