package sec01.exam15;

public class StringIndexOfExample {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("로그래밍");
		System.out.println(location);
		
		System.out.println();
		
		//특정 문자열이 포함되어 있는지 여부에 따라 실행 코드를 달리할 때 자주 사용됨.
		//-1값을 리턴하면 특정 문자열이 포함되어 있지 않다는 뜻입니다.
		if(subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책이군요.");
			
		} else {
			System.out.println("자바와 관련없는 책이군요.");
		}
	}

}
