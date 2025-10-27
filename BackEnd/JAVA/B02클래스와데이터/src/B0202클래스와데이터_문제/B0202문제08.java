package B0202클래스와데이터_문제;
/*
	
		// [문제4] 1등 번호, 이름 출력 (여러명이면 전부 출력)
		// [정답4] 
1001 이만수 남 100 40
1004 이철민 남 53 87

 */

class Student220208{
	int number;
	String name;
	String gender;
	int kor;
	int math;
}

public class B0202문제08 {
	public static void main(String[] args) {
		
		String[][] data = {
		//     번호      이름    성별   국어   수학
			{"1001" , "이만수" , "남", "100","40"},
			{"1002" , "이영희" , "여", "70", "30"},
			{"1003" , "김민정" , "여", "64", "15"},
			{"1004" , "이철민" , "남", "53", "87"},
			{"1005" , "오만석" , "남", "49", "80"},
			{"1006" , "최이슬" , "여", "14", "90"}
		};
		
		Student220208[] stList = new Student220208[data.length];
		
	} 
}






