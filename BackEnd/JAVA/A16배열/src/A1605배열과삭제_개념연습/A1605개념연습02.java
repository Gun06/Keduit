package A1605배열과삭제_개념연습;

import java.util.Arrays;
import java.util.Random;

/*
[문제]
numList에 랜덤숫자1~100을 5개 저장한후, 출력한다. 
각각의 숫자가 시험점수이다. 
60점미만은 전부 삭제후 출력하시오.
*/ 
/*
[출력예시]
[74, 40, 15, 13, 72]
74 72  
*/
public class A1605개념연습02 {
	public static void main(String[] args) {
		int[] scoreList = new int[5];
	    Random ran = new Random();
		for(int i = 0; i < scoreList.length; i++){
			int r = ran.nextInt(100) + 1;
			scoreList[i] = r;
	    }
		System.out.println(Arrays.toString(scoreList));
	    int index = 0;
		for(int i= 0; i < scoreList.length; i++) {    	
	    	if(scoreList[i] >= 60) {
	    		scoreList[index] = scoreList[i];
	    		index += 1;
	    	}
	    }
		for(int i = 0; i < index; i++) {
	    	System.out.print(scoreList[i] + " ");
	    }
	}
}
