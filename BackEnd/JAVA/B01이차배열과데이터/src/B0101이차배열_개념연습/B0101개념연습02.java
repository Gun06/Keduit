package B0101이차배열_개념연습;

import java.util.Arrays;
/*
[문제]
aLists 의 첫번째 값이서 두번째 값을 뺀 결과가 음수일 경우 "o"를 출력하고,
그렇지 않으면, "x"를 출력하시오.
*/ 
/* 
[출력예시]
x o x o x o
*/
public class B0101개념연습02 {
	public static void main(String[] args) {
	
		 int[][] aLists = {
		               {15, 13},
		               {9, 23},
		               {5, 2},
		               {7, 13},
		               {100, 43},
		               {1, 63},
		               };
		        
		           for(int i = 0; i < aLists.length; i++){
		               int a = aLists[i][0] - aLists[i][1];
		               if(a < 0){
		            	   System.out.print("o ");
		               }else{
		            	   System.out.print("x ");
		               }
		           }
	}
}
