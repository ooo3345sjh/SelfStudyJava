package sec04.exam03;

public class Car {
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas∞° æ¯Ω¿¥œ¥Ÿ.");
			return false;	
		}
		System.out.println("gas∞° ¿÷Ω¿¥œ¥Ÿ.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("gas¿‹∑Æ:" + gas + ")");
				gas -= 1;
			} else {
				System.out.println("∏ÿ√‰¥œ¥Ÿ.(gas¿‹∑Æ:" + gas + ")");
				return;
			}
		}
	}
}
