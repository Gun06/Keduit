package B0203클래스와정렬_문제;

import java.util.Arrays;


/*
 	[문제]
   	국어 점수순으로 오름차순정렬을 하시오.
	[정답]
		1005 23 11 76 
		1002 40 43 12 
		1003 60 21 42 
		1004 76 54 55 
		1001 100 20 32 
*/

class Student220301{
	int number;
	int kor;
	int math;
	int eng;
}

public class B0203문제01 {

	public static void main(String[] args) {
		/*
		        student배열은 이번 학기 중간고사 성적이다.
		        가로 한 줄을 기준으로 맨 앞은 번호이고, 뒤에 숫자 3개는
		        각각 국어, 수학, 영어 점수이다. 
		*/

		int[][] arr = {
		    {1001, 100, 20, 32},        
		    {1002,  40, 43, 12},         
		    {1003,  60, 21, 42},         
		    {1004,  76, 54, 55},        
		    {1005,  23, 11, 76}          
		};
		
		Student220301[] stList = new Student220301[arr.length];
			
	
		
			
	}

}
