package A1604배열과추가_개념연습;

import java.util.Arrays;
import java.util.Random;

/*
[문제]
aList에 1부터 10 사이의 랜덤 숫자 10개를 추가합니다.
aList의 값들 중 짝수만 bList에 추가하고, aList와 bList 모두 출력하시오.
*/
/*
[출력예시]
[3, 1, 8, 2, 10, 1, 3, 3, 3, 6]
8 2 10 6 
*/
public class A1604개념연습03 {
	public static void main(String[] args) {
		int[] aList = new int[10];
		int[] bList = new int[10];
	    Random ran = new Random();
		for(int i = 0; i < 10; i++){
			int r = ran.nextInt(10) + 1;
			aList[i] = r;
	    }
		int index = 0;
	    for(int i = 0; i < aList.length; i++){
	        if(aList[i] % 2 == 0){
	        	bList[index] = aList[i];
	        	index+= 1;
	        }
	    }
	    System.out.println(Arrays.toString(aList));
	    for(int i = 0; i < index; i++) {
	    	System.out.print(bList[i] + " ");
	    }
	}
}
