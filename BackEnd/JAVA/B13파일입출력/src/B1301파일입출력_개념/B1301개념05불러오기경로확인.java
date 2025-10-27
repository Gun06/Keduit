package B1301파일입출력_개념;

import java.io.File;
import java.io.FileReader;

public class B1301개념05불러오기경로확인 {
	public static void main(String[] args) {
		
		String fileName = "경로실패.txt";		
		FileReader fr = null;
		String data = "";
		
		File file = new File(fileName); 
		
		if(file.exists()) {	// 파일이 있는지 없는지 경로를 확인할 수 있다.
			try {
				fr = new FileReader(fileName); 	// 저장된 파일을 읽어온다.			
				while(true) {
					int read = fr.read(); 		// 한글자씩 int로 가져온다. 
					if(read != -1) {
						data += (char)read; 	// read값이 int형으로 char로 형변환 후 저장				
					} else {
						break;
					}				
				}			
				fr.close();       
				
				System.out.println(data);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("불러오기 실패");
		}
		
	}
}