package sec01.exam04;

import java.awt.*;

public class BeepPtintExample5 {

	public static void main(String[] args) {
		Thread thread = new Thread() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try { Thread.sleep(500); } catch(Exception e) {}
				}
				
			}
		};
		
		String threadName = thread.getName();
		System.out.println(threadName);
		
		for(int i=0; i<5; i++) {
			System.out.println("¶ò");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}

}
