package A1110조건문과중첩;

import java.util.Random;

/*
	[조건문의 중첩 연습1]
	조건문의 중첩이란, 하나의 조건문 안에 또 다른 조건문을 넣는 것을 의미합니다.
	
	1부터 10까지의 랜덤 숫자 두 개를 각각 a와 b에 저장합니다.
	새로운 랜덤 숫자(1~2)를 c에 저장합니다.
	
	[조건]
	(1) c의 값이 1이면 a와 b의 합을 출력합니다.
	(2) c의 값이 2이면 a에서 b를 뺀 차이를 양수로 출력합니다.
 */

/*
	[출력예시]
	8 3 1
	11
	[출력예시]
	1 5 2
	4
 */

public class A1110개념01_조건문과중첩연습1 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int a = ran.nextInt(10) + 1;
		int b = ran.nextInt(10) + 1;
		int c = ran.nextInt(2) + 1;
		System.out.println(a + " " + b + " " + c);
		
		int d = 0;
		if(c == 1) {
			d = a + b;
		}
		if(c == 2) {
			d = a - b;
			if(d < 0) {
				d = -d;
			}
		}
		System.out.println(d);
		
	}
}
