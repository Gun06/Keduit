package A1605배열과삭제_문제;

import java.util.Arrays;
import java.util.Random;

/*
[문제]
numList에 1부터 100 사이의 랜덤 숫자 5개를 저장한 후, 
짝수는 모두 삭제하고, 리스트 전체를 출력하시오.
*/ 
/*
[출력예시]
[13, 67, 93, 19, 24]
13 67 93 19 
*/
public class A1605문제03 {
	public static void main(String[] args) {
int[] numList = new int[5];
	    Random ran = new Random();
		for(int i = 0; i < 5; i++){
			int r = ran.nextInt(100) + 1;
			numList[i] = r;
	    }
		System.out.println(Arrays.toString(numList));
	    int index = 0;
	    for(int i =0; i < 5; i++) {
	    	if(numList[i] % 2 != 0) {
	    		numList[index] =numList[i];
	    		index += 1;
	    	}
	    }
	    for(int i = 0; i < index; i++) {
	    	System.out.print(numList[i] + " ");
	    }
	}
}
