package B0702스태틱DOA_개념;

/*
[문제] 
	학생 점수를 전부 5점씩 올리시오.
[정답]
	1004 오지호 55
	1004 오지호 55
	1004 오지호 55
	1004 오지호 55
	----------
	1004 오지호 75
	1004 오지호 75
	1004 오지호 75
	1004 오지호 75
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
	static Student[] studentList = null;
	
	static void setData(String[][] arr) {
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
	static void printList() {
		for(int i = 0; i < studentList.length; i++) {
			studentList[i].printData();
		}
	}
	
	static void getSolution() {
		for(int i = 0; i < studentList.length; i++) {
			int score = studentList[i].getScore();
			studentList[i].setScore(score + 5); 
			if(studentList[i].getScore() > 100) {
				studentList[i].setScore(100);
			}
		}
	}
	
	
}


public class B0702개념01스태틱학생수정 {
	public static void main(String[] args) {
		String[][] arr = {
				{"1001" ,"김철수" , "10"},
				{"1002" ,"이만수" , "60"},
				{"1003" ,"김성수" , "90"},
				{"1004" ,"오지호" , "55"},
			};
		
		// static 은 보통 DAO 에 많이 붙이며, 아래와같이 new 를 하지않고도 사용할수있어 편리하다.
		//StudentDAO studentDAO = new StudentDAO();
		StudentDAO.setData(arr);
		StudentDAO.printList();
		StudentDAO.getSolution();
		System.out.println("----------");
		StudentDAO.printList();
	}
}
