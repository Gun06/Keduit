package B0101이차배열_개념연습;

import java.util.Arrays;
/* 
[이차리스트와 수정 연습]
aList 와 bList 을aList는 1씩 증가 bbList는 2씩 증가하시오.
*/ 
/* 
[출력예시]
[11, 56]
[55, 3]
[14, 25]
[13, 26]
*/
public class B0101개념연습05 {
	public static void main(String[] args) {
	
		 int[][] aLists = {
		           {10, 54},
		           {54, 1},
		           {13, 23},
		           {12, 24},
		           };

		       for(int i = 0; i < aLists.length; i++){
		           aLists[i][0] += 1;
		           aLists[i][1] += 2;
		       }
		       for(int i = 0; i < aLists.length; i++){
		    	   System.out.println(Arrays.toString(aLists[i]));
		       }
	}
}
