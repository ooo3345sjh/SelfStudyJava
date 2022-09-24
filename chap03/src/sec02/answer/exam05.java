package sec02.answer;

public class exam05 {

	public static void main(String[] args) {
		
		//다음 코드를 싱행하면 출력 결과로 5를 기대했는데 4가 출력되었습니다. 어디에 잘못 작성된 것일까요?
		
		int var1 = 5;
		int var2 = 2;
		double var3 = var1 / var2; // 5에서 2를 나눔으로써 2가 저장됨.
		// douvlr var3 = (double)var1 / var2 를 하면 2.5가 저장됨.
		int var4 = (int) (var3 * var2); // 2*2가 되어 4가 저장됨.
		System.out.println(var4);
	}

}
