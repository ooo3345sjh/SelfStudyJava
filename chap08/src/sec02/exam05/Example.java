package sec02.exam05;

public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		//InterfaceA������ methodA()�� ȣ�Ⱑ��
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println(); 
		
		////InterfaceA������ methodB()�� ȣ�Ⱑ��
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		//InterfaceA������ methodA(), methodB(), methodC() ��� ȣ�Ⱑ��
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
