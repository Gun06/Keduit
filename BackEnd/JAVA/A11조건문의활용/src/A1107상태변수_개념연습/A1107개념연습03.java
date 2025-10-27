package A1107상태변수_개념연습;

import java.util.Random;

/*
[문제]
1부터 10 사이의 랜덤 숫자 중 두 개를 출력합니다.
하나는 반드시 1부터 5 사이의 숫자여야 하고,
나머지 하나는 반드시 6부터 10 사이의 숫자여야 합니다.
두 숫자의 출력 순서는 랜덤으로 출력되어야 합니다.    
*/

/*
[출력예시]
3 10
1
3 10

[출력예시]
2 9
2
9 2
*/
public class A1107개념연습03 {
	public static void main(String[] args) {
		Random ran = new Random();
		int r1 = ran.nextInt(5) + 1;
		int r2 = ran.nextInt(5) + 6;
		System.out.println(r1 + " " + r2);
		
		int state = ran.nextInt(2) + 1;
		System.out.println(state);
			
	    if(state == 1) {
	    	System.out.println(r1 + " " + r2);
	    }
	    if(state == 2) {
	    	System.out.println(r2 + " " + r1);
	    }
	}
}
