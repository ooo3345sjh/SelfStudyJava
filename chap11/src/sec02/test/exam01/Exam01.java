package sec02.test.exam01;

import java.text.*;
import java.util.*;

public class Exam01 {

	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� hh�� mm��");
		String str = sdf.format(now);
		System.out.println(str);
	}

}
