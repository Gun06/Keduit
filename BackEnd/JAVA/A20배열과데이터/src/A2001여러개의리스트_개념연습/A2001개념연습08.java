package A2001여러개의리스트_개념연습;

import java.util.Arrays;
import java.util.Random;

/* 
[문제]
aList에 1부터 50 사이의 랜덤 숫자 5개를 추가하고,
bList에 51부터 100 사이의 랜덤 숫자 5개를 추가합니다.
aList와 bList의 각 요소의 합이 85 이하인 숫자만 삭제하고, 남은 리스트 전체를 출력하시오.
*/ 
/* 
[출력예시]
[45, 17, 6, 25, 42]
[99, 65, 53, 73, 54]
45 25 42 
99 73 54 
*/

public class A2001개념연습08 {
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
	    	if(a > 85) {
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
