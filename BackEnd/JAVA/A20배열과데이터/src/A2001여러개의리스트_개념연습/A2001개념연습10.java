package A2001여러개의리스트_개념연습;

import java.util.Arrays;
import java.util.Random;

/* 
[문제]
aList와 bList의 값을 각각 비교해 5보다 작은 숫자의 개수를 각각 cList 에저장후 출력하시오.
*/ 
/* 
[출력예시]
[5, 3, 7, 3, 8]
[3, 2, 4, 9, 7]
[1, 2, 1, 1, 0]
*/

public class A2001개념연습10 {
	public static void main(String[] args) {
	    int[] aList =  {5, 3, 7, 3, 8};
	    int[] bList =  {3, 2, 4, 9, 7};
	    int[] cList = new int[aList.length];

	    for(int i = 0; i < 5; i++) {
	    	int a = aList[i];
	    	int b = bList[i];
	    	
	    	int count = 0;
	    	if(a < 5) {
	    		count += 1;
	    	}
	    	if(b < 5) {
	    		count += 1;
	    	}
	    	cList[i] = count;
	    }
	    
	    System.out.println(Arrays.toString(aList));
	    System.out.println(Arrays.toString(bList));
	    System.out.println(Arrays.toString(cList));
	    

	    
	}
}
