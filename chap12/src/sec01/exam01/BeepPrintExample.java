package sec01.exam01;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit(); //Toolkit ��ü ���
		for(int i=0; i<5; i++) {
			toolkit.beep(); //������ �߻�
			try { Thread.sleep(500); /*0.5�ʰ� �Ͻ�����*/ } catch(Exception e) {}
			
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try { Thread.sleep(500); /*0.5�ʰ� �Ͻ�����*/ } catch(Exception e) {}
		}
	}

}
