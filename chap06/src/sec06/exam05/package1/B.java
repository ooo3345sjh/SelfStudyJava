package sec06.exam05.package1; //A�� ��Ű���� ����

public class B {
	public B() {
		A a = new A();
		a.field1 = 1;   //(o)
		a.field2 = 1;   //(o)
		//a.field3 = 1;   //(x)  <--------private�ʵ� ���� �Ұ�(������ ����)
		
		a.method1();    //(o)
		a.method2();    //(o)
		//a.method3();    //(x) <--------private�޼ҵ� ���� �Ұ�(������ ����)
	}
}
