package sec02.test.exam02;

import java.io.*;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		String filePath = "src/sec02/test/exam02/AddLineNumberExample.java";
		FileReader fileReader = new FileReader(filePath);
		BufferedReader bufferReader = new BufferedReader(fileReader);
		
		int rowNumber = 0;
		String rowData;
		while((rowData = bufferReader.readLine()) != null) {
				System.out.println(++rowNumber + ": " + rowData);
				
		}
		
		bufferReader.close();
		
		
	}

}
