package A2001여러개의리스트_개념연습;

import java.util.Arrays;
import java.util.Random;

/* 
[문제]
aList와 bList에 각각 1부터 9 사이의 랜덤 숫자 10개를 추가한 후,
aList와 bList가 일치하는 경우 삭제 후 리스트 전체를 출력하시오.
*/ 
/* 
[출력예시]
[4, 6, 7, 1, 9, 2, 7, 2, 6, 7]
[6, 6, 6, 1, 9, 9, 3, 9, 4, 3]
4 7 2 7 2 6 7 
6 6 9 3 9 4 3 
*/

public class A2001개념연습07 {
	public static void main(String[] args) {
	    int[] aList = new int[10];
	    int[] bList = new int[10];

	    Random ran = new Random();
	    for(int i = 0; i < 10; i++) {
	    	int r1 = ran.nextInt(9) + 1;
	    	aList[i] = r1;
	    	int r2 = ran.nextInt(9) + 1;
	    	bList[i] = r2;
	    }
	    
	    System.out.println(Arrays.toString(aList));
	    System.out.println(Arrays.toString(bList));
	    
	    int index = 0;
	    
	    for(int i = 0; i < aList.length; i++){
	    	boolean a = aList[i] == bList[i];
	    	if(!a) {
	    		aList[index] = aList[i];
	    		bList[index] = bList[i];
	    		index += 1;
	    	}
	    }
	    for(int i = 0; i < index; i++) {
	    	System.out.print(aList[i] + " ");
	    }
	    System.out.println();
	    for(int i = 0; i < index; i++) {
	    	System.out.print(bList[i] + " ");
	    }
	}
}
