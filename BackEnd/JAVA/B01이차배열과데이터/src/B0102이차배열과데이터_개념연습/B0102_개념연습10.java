package B0102이차배열과데이터_개념연습;
/*
[문제] 국어 + 수학 점수합이 1등 번호, 이름 출력 (여러명이면 전부 출력)
[정답] 
	1001번 = 이만수
	1004번 = 이철민 
 */


public class B0102_개념연습10 {
	
	
	public static void main(String[] args) {
		
		String[][] student = {
				//     번호      이름    성별   국어   수학
					{"1001" , "이만수" , "남", "100","40"},
					{"1002" , "이영희" , "여", "70", "30"},
					{"1003" , "김민정" , "여", "64", "15"},
					{"1004" , "이철민" , "남", "53", "87"},
					{"1005" , "오만석" , "남", "49", "80"},
					{"1006" , "최이슬" , "여", "14", "90"}
				};
				
				
				// [문제] 1등 번호, 이름 출력 (여러명이면 전부 출력)
				// [정답] 
				//		1001번 = 이만수
				//		1004번 = 이철민
				int maxTotal = 0;
				for(int i=0; i<student.length; i++) {
					int korScore  = Integer.parseInt(student[i][3]);
					int mathScore = Integer.parseInt(student[i][4]);
					int total = korScore + mathScore;
					
					if(maxTotal < total) {
						maxTotal = total;
					}
				}
				
				for(int i=0; i<student.length; i++) {
					int korScore  = Integer.parseInt(student[i][3]);
					int mathScore = Integer.parseInt(student[i][4]);
					int total = korScore + mathScore;
					
					if(maxTotal == total) {
						System.out.println(student[i][0] + "번 = " + student[i][1]);
					}
				}
		
		
	} 
	
}






