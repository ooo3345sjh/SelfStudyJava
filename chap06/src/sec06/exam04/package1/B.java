package sec06.exam04.package1; // 패키지가 A와 동일

public class B {
	//필드
	A a1 = new A(true);     //(O)
	A a2 = new A(1);        //(O)
  //A a3 = new A("문자열");   //(x)  <---------private생성자 접근 불가(컴파일 에러)
			
}
