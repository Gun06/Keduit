package B1301파일입출력_개념;

import java.io.FileWriter;
import java.io.IOException;

public class B1301개념03예외처리2 {
	public static void main(String[] args) {
		
		String fileName = "src/B1301파일입출력_개념/file03.txt"; // 경로를지정하면  폴더에 저장가능
		FileWriter fw = null; 
		String data = "김철수,10\n이영희,30\n박만수,50";
		try {
			fw = new FileWriter(fileName);
			fw.write(data);
            fw.close();
		}catch(Exception e) { // Exception 을 사용해도되고 IOException 을사용해도된다.
			e.printStackTrace();
		}
		
	}
}