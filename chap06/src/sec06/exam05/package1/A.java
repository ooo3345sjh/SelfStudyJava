package sec06.exam05.package1;

public class A {
	
	//필드
	public int field1; //<---------public 접근 제한
	int field2;        //<---------default 접근 제한
	private int field3;//<---------private 접근 제한
	
	//생성자
	public A(){
		field1 = 1;    //(o)
		field2 = 2;    //(o)
		field3 = 3;    //(o)
		                       //클래스 내부일 경우 접근 제한자의 영향을 받지 않음
		method1();     //(o)
		method2();     //(o)
		method3();     //(o)
	}
	
	public void method1() {}
	void method2() {}
	private void method3() {}
}
