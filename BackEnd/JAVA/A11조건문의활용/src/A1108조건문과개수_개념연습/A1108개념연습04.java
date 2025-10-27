package A1108조건문과개수_개념연습;

import java.util.Random;

/*
    [문제]
    1부터 99 사이의 랜덤 숫자를 생성하여 저장합니다.
    생성된 숫자를 각 자리별로 나눈 후, 숫자 3, 6, 9의 개수를 확인합니다.

    [조건]
    (1) 3, 6, 9의 개수가 2개이면, "짝짝"을 출력합니다.
    (2) 3, 6, 9의 개수가 1개이면, "짝"을 출력합니다.
    (3) 3, 6, 9의 개수가 0개이면, 해당 숫자를 그대로 출력합니다.    
*/

/*
    [출력예시]
    33
    2
    짝짝    
*/
public class A1108개념연습04 {
	public static void main(String[] args) {
		Random ran = new Random();
		int r = ran.nextInt(99) + 1;
		System.out.println(r);

	    int a = r / 10;
	    int b = r % 10;

	    int count = 0;
	    if(a == 3 || a == 6 || a == 9) {
	        count = count + 1;
	    }
	    if(b == 3 || b == 6 || b == 9) {
	        count = count + 1;
	    }

	    if(count == 2) {
	    	System.out.println("짝짝");
	    }
	    if(count == 1) {
	    	System.out.println("짝");
	    }
	    if(count == 0) {
	    	System.out.println(r);
	    }
	}
}
