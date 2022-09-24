package sec02.test.exam03;

public class MovieThread extends Thread {
	
	@Override
	public void run() {
		
			try {
				
				while(true) {
				System.out.println("동영상을 재생합니다.");
				Thread.sleep(1);
				}
				
			} catch(InterruptedException e) {

			}
			
	}
		
}


