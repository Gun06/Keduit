package A0903논리와서술형;

import java.util.Random;

/*
	[문제]
	1부터 9 사이의 랜덤 숫자 3개를 저장합니다.
	세 개의 랜덤 숫자를 출력합니다.
	첫 번째 숫자가 가장 큰지 구하시오.
 */
/*
	[출력예시]
	6
	8
	4
	false
 */

public class A0903개념01_최대 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int a = ran.nextInt(9) + 1;
		int b = ran.nextInt(9) + 1;
		int c = ran.nextInt(9) + 1;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		boolean d = a > b && a > c;
		System.out.println(d);
		
	}
}
