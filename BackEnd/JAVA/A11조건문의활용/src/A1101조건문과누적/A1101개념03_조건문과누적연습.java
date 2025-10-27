package A1101조건문과누적;

import java.util.Random;

/*
	[조건문과 누적 연습]
	100부터 999 사이의 랜덤 숫자를 저장한 후,
	각 자리수가 5보다 큰 값들만 누적하시오.
 */

/*
	[출력예시]
	406
	6 
	[출력예시]
	846
	14
 */

public class A1101개념03_조건문과누적연습 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int a = ran.nextInt(900) + 100;
		System.out.println(a);
		
		int b = a / 100;
		int c = a % 100 / 10;
		int d = a % 10;
		
		int total = 0;
		if(b > 5) {
			total = total + b;
		}
		if(c > 5) {
			total = total + c;
		}
		if(d > 5) {
			total = total + d;
		}
		System.out.println(total);		
		
	}
}
