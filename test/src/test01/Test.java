package test01;

import java.io.*;

public class Test {

	public static void main(String[] args) {
    	
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		boolean o1 = (obj1 == obj2);
		boolean o2 = obj1.equals(obj2);
		
		System.out.println(o1);
		System.out.println(o2);
		
		
	}

}
