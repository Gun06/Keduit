package A2001여러개의리스트_개념연습;

import java.util.Arrays;

/* 
[이차리스트와 수정 연습]
a 와 b를 비교해서 둘다 짝수이면 1씩증가 하시오.
*/ 
/* 
[출력예시]
[17, 55, 33, 17, 39]
[34, 31, 22, 39, 59]
*/

public class A2001개념연습05 {
	public static void main(String[] args) {
		int[] aList = {17, 54, 33, 16, 39};
	    int[] bList = {34, 30, 22, 38, 59};
	    for(int i = 0; i < aList.length; i++){
	    	boolean a = aList[i] % 2 == 0;
	        boolean b = bList[i] % 2 == 0;
	        if(a && b){
	            aList[i] += 1;
	            bList[i] += 1;
	        }
	        
	    }
	    System.out.println(Arrays.toString(aList));
	    System.out.println(Arrays.toString(bList));
	}
}
