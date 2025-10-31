package A1107상태변수_문제;
/*
[문제]
랜덤으로 숫자 2 또는 5 또는 7을 출력하시오.    
*/

import java.util.Random;

/*
[출력예시]
3
6

[출력예시]
1
2    
*/
public class A1107문제07 {
	public static void main(String[] args) {
		Random ran = new Random();
		int state = ran.nextInt(3) + 1;
		System.out.println(state);

	    if(state == 1) {
	        System.out.println(2);
	    }
	    if(state == 2) {
	    	 System.out.println(5);
	    }
	    if(state == 3) {
	    	 System.out.println(7);
	    }
	}
}
