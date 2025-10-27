package B1201벡터_개념;

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


public class B1201개념05_콜렉션 {
	public static void main(String[] args) {
		String[][] arr = {
				{"1001" ,"김철수" , "10"},
				{"1002" ,"이만수" , "60"},
				{"1003" ,"김성수" , "90"},
				{"1004" ,"오지호" , "55"},
			};
		
		Vector<Student> stList= new Vector<Student>();
		
		for(int i = 0; i < arr.length; i++) {
			int number = Integer.parseInt(arr[i][0]);
			String name = arr[i][1];
			int score = Integer.parseInt(arr[i][2]);
			Student st = new Student(number, name, score);
			stList.add(st);
		}
		
		for(int i = 0; i < stList.size(); i++) {
			stList.get(i).printData();
		}
		
		// 1005 , 유지연 , 100 을 저장하시오.
		Student st1 = new Student(1005, "유지연", 100);
		
		stList.add(st1);
		
		System.out.println("------------------");
		for(int i = 0; i < stList.size(); i++) {
			stList.get(i).printData();
		}
				
		// 김성수학생의 점수를 50으로 수정하시오.		
		stList.get(2).setScore(50);
		System.out.println("------------------");
		for(int i = 0; i < stList.size(); i++) {
			stList.get(i).printData();
		}
		
		// 점수가 60 미마은 전부 삭제하시오.		
		int n = 0;
		while(true) {
			if(n == stList.size()) {
				break;
			}
			
			if(stList.get(n).getScore() < 60) {
				stList.remove(n);
			}else {
				n += 1;
			}
		}
		
		System.out.println("------------------");
		for(int i = 0; i < stList.size(); i++) {
			stList.get(i).printData();
		}
		
		
	}
}
