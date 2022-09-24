package sec02.test.exam03;

public class ThreadExample {

	public static void main(String[] args) {
		Thread thread  = new MovieThread();
		thread.start();
		
		try { 
			Thread.sleep(1000); 
			} catch(InterruptedException e) {}
		
		thread.interrupt();
		System.out.println("프로그램을 종료합니다.");
		
	}

}
