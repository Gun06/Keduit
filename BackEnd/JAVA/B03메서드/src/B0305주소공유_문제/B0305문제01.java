package B0305주소공유_문제;

import java.util.Arrays;

public class B0305문제01 {
	
	public static void solution(int[][] student, int[] total) {
		
	}

	public static void main(String[] args) {
		/*
		        student배열은 이번 학기 중간고사 성적이다.
		        가로 한 줄을 기준으로 맨 앞은 번호이고, 뒤에 숫자 3개는
		        각각 국어, 수학, 영어 점수이다. 
		*/
		/*
        [문제] 
            각각 점수별총합을 아래 total배열에 추가하시오.
            순서대로 국어 , 수학 , 영어 점수이다.
        [정답]
            299,149,217
    */   
		int[][] student = {
		    {1001, 100, 20, 32},         // 152
		    {1002,  40, 43, 12},         // 95
		    {1003,  60, 21, 42},         // 123
		    {1004,  76, 54, 55},         // 185
		    {1005,  23, 11, 76}          // 110
		};
		
	    int[] total = {0,0,0};
	
	    solution(student, total);
	}

}
