package B1204어레이리스트DAO_개념;

import java.util.Vector;


class Student{
	 private int number;
	 private String name;
	 private int score;
	
	public Student(int number, String name, int score) { 
		this.number = number;
		this.name = name; 
		this.score = score;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getNumber() {
		return this.number;
	}
	public String getName() {
		return this.name;
	}
	public int getScore() {
		return this.score;
	}
	
	public void printData() {
		System.out.println(number + " " + name  + " " + this.score);
	}
}

class StudentDAO{
	public static StudentDAO instance = new StudentDAO();
	
	private Vector<Student> stList =new Vector<Student>();
	
	void insert(Student st) {
		stList.add(st);
	}
	void delete(int index) {
		stList.remove(index);
	}
	void printList() {
		System.out.println("--------------");
		for(int i = 0; i< stList.size(); i++) {
			stList.get(i).printData();
		}
		System.out.println("--------------");
	}
	void setData(String[][] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			int number = Integer.parseInt(arr[i][0]);
			String name = arr[i][1];
			int score = Integer.parseInt(arr[i][2]);
			Student st = new Student(number, name, score);
			stList.add(st);
		}
		
	}
	void setUpdateScore(int index , int score) {
		stList.get(index).setScore(score);
	}
	void setDeleteLower(int score) {
		int n = 0;
		while(true) {
			if(n == stList.size()) {
				break;
			}
			
			if(stList.get(n).getScore() < score) {
				stList.remove(n);
			}else {
				n += 1;
			}
		}
	}
}

public class B1204개념01_어레이리스트DAO {
	public static void main(String[] args) {
		String[][] arr = {
				{"1001" ,"김철수" , "10"},
				{"1002" ,"이만수" , "60"},
				{"1003" ,"김성수" , "90"},
				{"1004" ,"오지호" , "55"},
			};
		
		StudentDAO.instance.setData(arr);
		
	
		StudentDAO.instance.printList();
		
		
		// 1005 , 유지연 , 100 을 저장하시오.
		Student st1 = new Student(1005, "유지연", 100);
		StudentDAO.instance.insert(st1);
		StudentDAO.instance.printList();
		
		
		// 김성수학생의 점수를 50으로 수정하시오.		
		StudentDAO.instance.setUpdateScore(2, 50);
		StudentDAO.instance.printList();
		
		// 60점미만은 삭제하시오.
		StudentDAO.instance.setDeleteLower(60);
		StudentDAO.instance.printList();

		
		
		
		
	}
}
