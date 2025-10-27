package B0203클래스와정렬;

import java.util.Arrays;

public class B0203개념02_다중정렬 {

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
	        	1005 23 11 76 
				1003 60 21 42 
				1002 60 43 12 
				1004 76 54 55 
				1001 100 20 32 

	            
	    */
	    
	    
		int[][] arr = {
			    {1001, 100, 20, 32},        
			    {1002,  60, 43, 12},         
			    {1003,  60, 21, 42},         
			    {1004,  76, 54, 55},        
			    {1005,  23, 11, 76}          
			};
			
			Student220301[] stList = new Student220301[arr.length];
				
			for(int i = 0; i  < arr.length; i++) {
				Student220301 st =new Student220301();
				st.number = arr[i][0];
				st.kor = arr[i][1];
				st.math = arr[i][2];
				st.eng = arr[i][3];
				stList[i] = st;
			}
			
			
			// 내림차순은 -1 과 1을 서로 바꾸어 적으면된다. 
			Arrays.sort(stList, (a , b)->{
				if(a.kor < b.kor) {
					return -1;
				}else if(a.kor > b.kor) {
					return 1;
				}else {
					if(a.math < b.math) {
						return -1;
					}else if(a.math > b.math) {
						return 1;
					}else {
						return 0;
					}
				}
			});
			
			for(int i=0; i<stList.length; i++) {
					System.out.print(stList[i].number + " ");
					System.out.print(stList[i].kor + " ");
					System.out.print(stList[i].math + " ");
					System.out.print(stList[i].eng + " ");
					System.out.println();
					
			}
			
	}

}
