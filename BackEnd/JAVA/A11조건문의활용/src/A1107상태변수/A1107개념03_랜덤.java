package A1107상태변수;

import java.util.Random;

/*
    [문제]
    랜덤으로 숫자 3이나 7을 출력하시오.   
*/

/*
    [출력예시]
    1
    3

    [출력예시]
    2
    7    
*/
public class A1107개념03_랜덤 {
	public static void main(String[] args) {
Random ran = new Random();
		
		
		int state = ran.nextInt(2) + 1;
		System.out.println(state);
		int c = 0;
		if(state == 1) {
			c = 3;
		}
		if(state == 2) {
			c = 7;
		}
		
		System.out.println(c);
	}
}
