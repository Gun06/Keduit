package B1301파일입출력_개념;

import java.io.FileWriter;
import java.io.IOException;

public class B1301개념01파일저장 {
	public static void main(String[] args) {
		
		// 세이브 파일 만들기 
		// 1) 변수생성          	==>  FileWriter fw = null; 
		// 1) 파일 생성          	==>  fw = new FileWriter("파일이름"); 
		// 2) 파일에 내용 저장 		==>  fw.write(저장할내용);
		// 3) 파일닫기           	==>  fw.close(); 
		
		String fileName = "file01.txt";
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(fileName);
			fw.write("안녕하세요");
			fw.close();
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		// 파일이 없으면 새로만들고,  같은이름의 파일이있으면 덮어씌운다. 
		
	}
}