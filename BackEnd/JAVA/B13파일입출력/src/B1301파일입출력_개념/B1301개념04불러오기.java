package B1301파일입출력_개념;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class B1301개념04불러오기 {
	public static void main(String[] args) {
		
		// 1) FileReader fr = null; 			// 변수선언
		// 1) fr = new FileReader(fileName); 	// 저장된 파일을 읽어온다.	
		// 2) fr.read(); 						// 한글자씩 int로 가져온다. 
												// 가져올 내용이 없으면 -1이 저장된다.
		// 3) fr.close(); 						// 사용후 반드시 닫아야 된다.
		
		String fileName = "src/B1301파일입출력_개념/file03.txt";		
		
		String data = "";
		
		try {
			FileReader fr = new FileReader(fileName);
			
			while(true) {
				int read = fr.read();
				if(read == -1) {
					break;
				}
				
				char ch = (char)read;
				data += ch;
				
				System.out.println(ch);
				
			}
			
			
			fr.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println();

		System.out.println(data);
		
	}
}