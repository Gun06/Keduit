package B0404클래스와DAO;
/*
1001 김철수 10
1002 이만수 60
1003 김성수 90
1004 오지호 55

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
			int number = Integer.parseInt(arr[i][0]);
			String name = arr[i][1];
			int score = Integer.parseInt(arr[i][2]);
			st.init(number, name, score);
			studentList[i] = st;
		}
	}
	void printList() {
		for(int i = 0; i < studentList.length; i++) {
			studentList[i].printData();
		}
	}
	
	void getSolution() {
		for(int i = 0; i < studentList.length; i++) {
			studentList[i].score += 5;
			if(studentList[i].score > 100) {
				studentList[i].score = 100;
			}
		}
	}
	
	
}


public class B0404개념01클래스와DAO {
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
