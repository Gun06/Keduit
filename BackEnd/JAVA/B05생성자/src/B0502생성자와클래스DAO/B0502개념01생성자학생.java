package B0502생성자와클래스DAO;


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
	Student(){};
	Student(int number, String name, int score){
		this.number = number;
		this.name = name; 
		this.score = score;
	}
	
	
//	void init(int number, String name, int score) { 
//		this.number = number;
//		this.name = name; 
//		this.score = score;
//	}
	
	void printData() {
		System.out.println(number + " " + name  + " " + this.score);
	}
}

class StudentDAO{
	Student[] studentList = null;
	
	void setData(String[][] arr) {
		 studentList = new Student[arr.length];
		for(int i = 0; i < studentList.length; i++) {
			int number = Integer.parseInt(arr[i][0]);
			String name = arr[i][1];
			int score = Integer.parseInt(arr[i][0]);
			Student st = new Student(number, name, score);
			studentList[i] = st;
		}
	}
	void printList() {
		for(int i = 0; i < studentList.length; i++) {
			studentList[i].printData();
		}
	}
	
	
}


public class B0502개념01생성자학생 {
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
	}
}
