package B1301파일입출력_개념;

import java.io.FileWriter;
import java.io.IOException;

public class B1301개념02예외처리 {
	public static void main(String[] args) {
		
		String fileName = "src/B1301파일입출력_개념/file02.txt"; 
		FileWriter fw = null; 
		String data = "김철수,10\n이영희,30\n박만수,50";
		try {
			fw = new FileWriter(fileName);
			fw.write(data);
            fw.close();
		}catch(IOException e) { // Exception 을 사용해도되고 IOException 을 사용해도 된다.
			e.printStackTrace();
		}
		
	}
}