package B0101이차배열_개념연습;

import java.util.Arrays;
/*
[문제]
aList와 bList의 값을 각각 검색해 둘 다 홀수일 경우 o 출력하고,
그렇지 않으면, "x"를 출력하시오.
*/ 
/* 
[출력예시]
xxxo
*/
public class B0101개념연습04 {
	public static void main(String[] args) {
	
		int[][] aLists = {
		              {99, 70},
		              {90, 71},
		              {5, 2},
		              {23, 11},
		};
							
		          for(int i = 0; i < aLists.length; i++){
		              boolean a = aLists[i][0] % 2 == 1;
		              boolean b = aLists[i][1] % 2 == 1;
		              if(a && b){
		            	  System.out.print("o");
		              }else{
		            	  System.out.print("x");
		              }
		          }
	}
}
