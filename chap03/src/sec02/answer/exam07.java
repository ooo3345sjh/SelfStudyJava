package sec02.answer;

public class exam07 {

	public static void main(String[] args) {
		
		//다음 코드를 실행하면 출력결과로 "10%입니다."를 기대했는데 "10%가 아닙니다."가 출력되었습니다. 어디에서 잘못 작성된 것일까요.
		
		float var1 = 10f;
		float var2 = var1 / 100; 
		//float의 0.1f는 실수의 저장 방식인 부동 소수점 방식이 0.1을 정확히 표현할 수 없기 때문에 0.1의 근사값으로 표현되며 0.1보다 큰값이다.
		if(var2 == 0.1) {
			System.out.println("10%입니다.");
		} else{
			System.out.println("10%가 아닙니다.");
		}
	}

}
