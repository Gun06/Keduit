package A1109서술형조건문;

import java.util.Random;

/*
	[조건문과 서술 연습]
	동전의 앞과 뒤를 랜덤 숫자 1(앞) 또는 2(뒤)로 표현합니다.
	동전 두 개를 던져서 결과를 확인합니다.
	
	[조건]
	(1) 두 동전이 모두 앞이면 "1등"을 출력합니다.
	(2) 두 동전이 모두 뒤이면 "2등"을 출력합니다.
	(3) 그 외의 경우에는 "꽝"을 출력합니다.
 */

/*
	[출력예시]
	2 1
	꽝
	[출력예시]
	1 1
	1등
 */

public class A1109개념01_조건문과서술연습 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int a = ran.nextInt(2) + 1;
		int b = ran.nextInt(2) + 1;
		System.out.println(a + " " + b);
		
		boolean c = a == 1 && b == 1;
		boolean d = a == 2 && b == 2;
		boolean e = a != b;
		
		if(c) {
			System.out.println("1등");
		}
		if(d) {
			System.out.println("2등");
		}
		if(e) {
			System.out.println("꽝");
		}
		
	}
}
