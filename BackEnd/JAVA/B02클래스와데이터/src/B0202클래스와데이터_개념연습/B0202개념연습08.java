package B0202클래스와데이터_개념연습;
/*
	
		 [문제] 1등 번호, 이름 출력 (여러명이면 전부 출력)
		 [정답] 
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

public class B0202개념연습08 {
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
		for(int i = 0; i < data.length; i++) {		
			Student220208 st = new Student220208();
			st.number = Integer.parseInt(data[i][0]);
			st.name = data[i][1];
			st.gender = data[i][2];
			st.kor = Integer.parseInt(data[i][3]);
			st.math = Integer.parseInt(data[i][4]);
			stList[i] = st;
		}	
		
		
		int maxTotal = 0;
		for(int i=0; i<stList.length; i++) {
			int korScore  = stList[i].kor;
			int mathScore = stList[i].math;
			int total = korScore + mathScore;
			
			if(maxTotal < total) {
				maxTotal = total;
			}
		}
		
		for(int i=0; i<stList.length; i++) {
			int korScore  = stList[i].kor;
			int mathScore = stList[i].math;
			int total = korScore + mathScore;
			
			if(maxTotal == total) {
				System.out.print(stList[i].number + " ");
				System.out.print(stList[i].name + " ");
				System.out.print(stList[i].gender + " ");
				System.out.print(stList[i].kor + " ");
				
				System.out.println(stList[i].math);
			}
		}
		
	} 
	
}






