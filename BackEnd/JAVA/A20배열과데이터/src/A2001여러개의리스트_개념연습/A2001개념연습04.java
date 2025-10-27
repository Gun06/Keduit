package A2001여러개의리스트_개념연습;

import java.util.Arrays;

/* 
[이차리스트와 수정 연습]
aList 와 bList 을aList는 1씩 증가 bbList는 2씩 증가하시오.
*/ 
/* 
[출력예시]
[11, 44, 24, 13, 54]
[56, 8, 6, 14, 52]
*/
public class A2001개념연습04 {
	public static void main(String[] args) {
		int[] aList = {10, 43, 23, 12, 53};
	    int[] bList = {54,  6,  4, 12, 50};
	    for(int i = 0; i < aList.length; i++){
	    	 aList[i] += 1;
	         bList[i] += 2;
	        
	    }
	    System.out.println(Arrays.toString(aList));
	    System.out.println(Arrays.toString(bList));
	}
}
