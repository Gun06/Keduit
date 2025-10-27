package A2001여러개의리스트_개념연습;

import java.util.Arrays;
import java.util.Random;

/* 
[문제]
aList에는 50부터 100 사이의 랜덤 숫자를, 
bList에는 1부터 50 사이의 랜덤 숫자를각각 5개씩 추가합니다. 
aList에서 bList의 합을값을 구해 그 값이 홀수이면 삭제 후 남은 리스트 전체를 출력하시오.
*/ 
/* 
[출력예시]
[38, 11, 18, 5, 24]
[55, 77, 89, 51, 58]
11 5 24 
77 51 58 
*/

public class A2001개념연습09 {
	public static void main(String[] args) {
	    int[] aList = new int[5];
	    int[] bList = new int[5];

	    Random ran = new Random();
	    for(int i = 0; i < 5; i++) {
	    	int r1 = ran.nextInt(50) + 1;
	    	aList[i] = r1;
	    	int r2 = ran.nextInt(50) + 51;
	    	bList[i] = r2;
	    }
	    
	    System.out.println(Arrays.toString(aList));
	    System.out.println(Arrays.toString(bList));
	    
	    
int index = 0;
	    
	    for(int i = 0; i < aList.length; i++){
	    	int a = aList[i] + bList[i];
	    	if(a % 2 != 1) {
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
