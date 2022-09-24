package sec02.test.exam04;

public class ThreadExample {

	public static void main(String[] args) {
		Thread thread = new MovieThread();
		thread.setDaemon(true);
		thread.start();
		
		try { Thread.sleep(3000); } catch(InterruptedException e) {}
		
		System.out.println("프로그램을 종료합니다.");
		
	}

}
