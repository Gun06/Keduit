package B1301파일입출력_개념;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/*
1001 김철수 1001
1002 이만수 1002
1003 김성수 1003
1004 오지호 1004

 */
class Student{
	int number;
	String name;
	int score;
	
	void init(int number, String name, int score) { 
		this.number = number;
		this.name = name; 
		this.score = score;
	}
	
	void printData() {
		System.out.println(number + " " + name  + " " + this.score);
	}
}

class StudentDAO{
	Student[] studentList = null;
	
	void setData(String[][] arr) {
		 studentList = new Student[arr.length];
		for(int i = 0; i < studentList.length; i++) {
			Student st = new Student();
			st.number = Integer.parseInt(arr[i][0]);
			st.name = arr[i][1];
			st.score = Integer.parseInt(arr[i][2]);
			studentList[i] = st;
		}
	}
	void printList() {
		for(int i = 0; i < studentList.length; i++) {
			studentList[i].printData();
		}
	}
	
	void saveData() {
		
		String data = "";
		
		for(int i = 0; i < studentList.length; i++) {
			data += studentList[i].number;
			data += ",";
			data += studentList[i].name;
			data += ",";
			data += studentList[i].score;
			data += "\n";
		}
		// 마지막글자 삭제
		data = data.substring(0, data.length()-1);
		
		String fileName = "src/A2501파일입출력_개념/student.txt"; 
		FileWriter fw = null; 
		try {
			fw = new FileWriter(fileName);
			fw.write(data);
            fw.close();
		}catch(Exception e) { // Exception 을 사용해도되고 IOException 을 사용해도 된다.
			e.printStackTrace();
		}
	}
	void loadData() {
		String fileName = "src/B1301파일입출력_개념/student.txt";		
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
				
			//	System.out.println(data);
				
				String[] strList = data.split("\n");
				System.out.println(strList.length);
				
				studentList = new Student[strList.length];
				
				for(int i = 0; i < strList.length; i++) {
					String[] str = strList[i].split(",");
					Student st = new Student();
					int number = Integer.parseInt(str[0]);
					String name = str[1];
					int score = Integer.parseInt(str[2]);
					st.init(number, name, score);
					studentList[i] = st;
				}
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("불러오기 실패");
		}
	}
	
}


public class B1301개념06학생데이터저장 {
	public static void main(String[] args) {
		String[][] arr = {
				{"1001" ,"김철수" , "10"},
				{"1002" ,"이만수" , "60"},
				{"1003" ,"김성수" , "90"},
				{"1004" ,"오지호" , "55"},
			};
		
		StudentDAO studentDAO = new StudentDAO();
		studentDAO.setData(arr);
		studentDAO.printList();
		studentDAO.saveData();
	}
}
