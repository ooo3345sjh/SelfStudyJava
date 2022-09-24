package sec02.answer;

public class exam01 {

	public static void main(String[] args) {
		
		byte b = 5;
		// b = -b; // 부호 연산시 int타입으로 변환되어 연산되기 때문에 컴파일 에러가 뜬다.
		b = (byte)-b;
		int result = 10 / b;
		System.out.println(result);
	}

}
