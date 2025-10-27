package B0304메서드이차배열_문제;


public class B0304문제03 {

	public static void solution(int[][] arr) {
		
	}
	
	public static void main(String[] args) {
		/*
         	 student배열은 이번 학기 중간고사 성적이다.
            가로 한 줄을 기준으로 맨 앞은 번호이고, 뒤에 숫자 3개는
            각각 국어, 수학, 영어 점수이다.
            
              [문제] 
                전체 1등 번호를 출력하시오.
                함수로 만드시오.
            [정답]  
                1004
				76
				54
				55
	    */
		
		int[][] student = {
				{1001, 100, 20, 32},
				{1002,  40, 43, 12},
				{1003,  60, 21, 42},
				{1004,  76, 54, 55},
				{1005,  23, 11, 76 }
		};
		
		solution(student);
	
	}
}
