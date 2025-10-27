package A1002조건문과논리;

import java.util.Random;

/*
	[조건문과 논리 연습]
	1부터 10 사이의 랜덤 숫자를 저장하고, 해당 숫자를 출력합니다.
	숫자가 4부터 7 사이일 경우 "당첨"을 출력하고, 그 외의 경우 "꽝"을 출력합니다.
 */

/*
	[출력예시]
	5
	당첨
 */

public class A1002개념01_조건문과논리연습 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int a = ran.nextInt(10) + 1;
		System.out.println(a);
		
		if(4 <= a && a <= 7) {
			System.out.println("당첨");
		}
		if(a < 4 || a > 7) {
			System.out.println("꽝");
		}
		
	}
}
