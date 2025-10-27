package A1605배열과삭제_개념연습;

import java.util.Arrays;

/*
1. 연습문제
numberList1의 값들중 0을 전부 삭제하시오.
*/ 
/*
2. 실행화면
[0, 0, 0, 1, 2, 3, 0, 5, 0, 7, 0, 0]
1 2 3 5 7 
*/
public class A1605개념연습04 {
	public static void main(String[] args) {
		int[] numList = {0, 0, 0, 1, 2, 3, 0, 5, 0, 7, 0, 0};
		System.out.println(Arrays.toString(numList));
	    int index = 0;
	    for(int i = 0; i < numList.length; i++) {
	    	if(numList[i] != 0) {
	    		numList[index] = numList[i];
	    		index += 1;
	    	}
	    }
	    for(int i = 0; i < index; i++) {
	    	System.out.print(numList[i] + " ");
	    }
	}
}
