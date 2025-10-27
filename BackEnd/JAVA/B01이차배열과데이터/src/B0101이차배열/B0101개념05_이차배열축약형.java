package B0101이차배열;

import java.util.Arrays;

/*
	기존의 aList와 bList를 2차원리스트로 표현이 가능하다. 
	
	aList[0] 인 10 과 bList[0]인 54를 하나로묶어 [10, 54]로 만들고,
	이를 다시 numberLists  에 넣어서 2차원배열로 만든다.  
	
	마찬가지로 [43, 6] 그리고 [23, 4]를 각각 numberLists 에 넣어서 최종적으로는 
	
	[[10, 54],[43, 6],[23, 4]] 이런형태로 표현하게된다. 
	
	각각의 값출력은 아래와 같다. 
	
	[출력]
	10 54
	43 6
	23 4

*/
public class B0101개념05_이차배열축약형 {
	public static void main(String[] args) {
		int[] aList = {10, 43, 23};
	    int[] bList = {54,  6,  4};

	    int[][] numberLists = {{10, 54},{43, 6},{23, 4}};
	    
	    System.out.print(numberLists[0][0] + " ");
	    System.out.println(numberLists[0][1]);
	    
	    System.out.print(numberLists[1][0] + " ");
	    System.out.println(numberLists[1][1]);
	    
	    System.out.print(numberLists[2][0] + " ");
	    System.out.println(numberLists[2][1]);
	    	
	    
	    System.out.println();
		
		for(int i=0; i < numberLists.length; i++) {
			System.out.println(Arrays.toString(numberLists[i]));
		}
	}
}
