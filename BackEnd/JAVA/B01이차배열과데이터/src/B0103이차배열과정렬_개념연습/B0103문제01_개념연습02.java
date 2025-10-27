package B0103이차배열과정렬_개념연습;

import java.util.Arrays;
import java.util.Collections;

public class B0103문제01_개념연습02 {

	public static void main(String[] args) {
		/*
		        student배열은 이번 학기 중간고사 성적이다.
		        가로 한 줄을 기준으로 맨 앞은 번호이고, 뒤에 숫자 3개는
		        각각 국어, 수학, 영어 점수이다. 
		*/

		int[][] student = {
		    {1001, 100, 20, 32},        
		    {1002,  40, 43, 12},         
		    {1003,  60, 21, 42},         
		    {1004,  76, 54, 55},        
		    {1005,  60, 11, 76}          
		};
		
		 /*
	        [다중정렬]
	        	다중정렬이란, 학생들 점수순으로 정렬한다고했을때, 
	        	똑같은 점수가 있을수있다. 
	        	그럼면 그다음 정렬기준을 정하는것을 다중정렬이라고한다.
	        	
	            다중정렬 연습을 위해 1003 번과 1005번의 국어점수를 둘다 60점으로 수정했다.  
	     */
		/*
	        [문제]
	            국어 점수순으로 오름차순정렬을 하시오.     
	            단, 국어점수가 같으면 수학점수로 오름차순정렬하시오.
	        [정답]
	        	[1002, 40, 43, 12]
				[1005, 60, 11, 76]
				[1003, 60, 21, 42]
				[1004, 76, 54, 55]
				[1001, 100, 20, 32]
	            
	    */
	    
	    
		
		Arrays.sort(student, (a , b)->{
			if(a[1] < b[1]) {
				return -1;
			}else if(a[1] > b[1]) {
				return 1;
			}else {
				if(a[2] < b[2]) {
					return -1;
				}else if(a[2] > b[2]) {
					return 1;
				}else {
					return 0;									
				}
				
			}
		});
		
		
		for(int i = 0; i < student.length; i++) {
			System.out.println(Arrays.toString(student[i]));
		}
			
	}

}
