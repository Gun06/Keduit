package B0102이차배열과데이터_개념연습;

public class B0102_개념연습09 {
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
		
		
		// [문제3] 국어점수가 수학점수 보다 큰 학생들 번호, 이름 출력 
		// [정답3] 
		//		1001번 = 이만수
		//		1002번 = 이영희
		//		1003번 = 김민정
		for(int i=0; i<student.length; i++) {
			int korScore  = Integer.parseInt(student[i][3]);
			int mathScore = Integer.parseInt(student[i][4]);
			
			if(korScore > mathScore) {
				System.out.println(student[i][0] + "번 = " + student[i][1]);
			}
		}
		System.out.println();
		
		
		
	} 
	
}






