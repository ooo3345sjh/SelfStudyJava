package sec06.exam05.package1; //A와 패키지가 동일

public class B {
	public B() {
		A a = new A();
		a.field1 = 1;   //(o)
		a.field2 = 1;   //(o)
		//a.field3 = 1;   //(x)  <--------private필드 접근 불가(컴파일 에러)
		
		a.method1();    //(o)
		a.method2();    //(o)
		//a.method3();    //(x) <--------private메소드 접근 불가(컴파일 에러)
	}
}
