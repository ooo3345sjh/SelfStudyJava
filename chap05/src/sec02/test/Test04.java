package sec02.test;

public class Test04 {
	public static void main(String[] args) {
		int max = 0;
		int[] arry = {1, 5, 3, 8, 2};
		
		for(int i=0; i<arry.length; i++) {
			if(max < arry[i]) {
				max = arry[i];
			} 

		}
		System.out.println("max: " + max);
	}
}
