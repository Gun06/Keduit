package B0101이차배열_개념연습;

import java.util.Arrays;
    /*
[문제]
aList와 bList의 값을 각각 검색해 둘 다 35보다 작은 수이면 "o"를 출력하고,
그렇지 않으면 "x"를 출력하시오.
    */ 
    /* 
[출력예시]
x x o x x 
    */
public class B0101개념연습01 {
	public static void main(String[] args) {
	
		 int[][] aLists = {
		               {56, 32},
		               {99, 100},
		               {20, 32},
		               {91, 73},
		               {27, 77},
		               };

		           for(int i = 0; i < 5; i++){
		               boolean a = aLists[i][0] < 35;
		               boolean b = aLists[i][1] < 35;
		               if(a && b){
		            	   System.out.print("o ");
		               }else{
		            	   System.out.print("x ");
		               }
		           }
	}
}
