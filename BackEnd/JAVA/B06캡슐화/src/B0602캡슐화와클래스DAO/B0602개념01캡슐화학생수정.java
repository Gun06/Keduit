package B0602캡슐화와클래스DAO;

/*
[문제] 
	학생 점수를 전부 5점씩 올리시오.
[정답]
	1001 김철수 10
	1002 이만수 60
	1003 김성수 90
	1004 오지호 55
	----------
	1001 김철수 15
	1002 이만수 65
	1003 김성수 95
	1004 오지호 60

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
	
	void setNumber(int number) {
		this.number = number;
	}
	void setName(String name) {
		this.name = name;
	}
	void setScore(int score) {
		this.score = score;
	}
	int getNumber() {
		return this.number;
	}
	String getName() {
		return this.name;
	}
	int getScore() {
		return this.score;
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
			int score = studentList[i].getScore();
			studentList[i].setScore(score + 5); 
			if(studentList[i].getScore() > 100) {
				studentList[i].setScore(100);
			}
		}
	}
	
	
}


public class B0602개념01캡슐화학생수정 {
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
		studentDAO.getSolution();
		System.out.println("----------");
		studentDAO.printList();
	}
}
