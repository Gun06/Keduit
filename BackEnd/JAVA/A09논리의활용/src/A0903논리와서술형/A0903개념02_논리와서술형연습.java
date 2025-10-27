package A0903논리와서술형;

import java.util.Random;

/*
	[서술형 논리 연습]
	철수는 암호 숫자의 규칙을 만들었습니다. 
	암호 숫자는 세 자리의 숫자이면서 모든 자리의 숫자가 짝수이어야 합니다.
	
	[조건]
	(1) 랜덤으로 100 ~ 999 사이의 숫자를 저장하고 출력합니다.
	(2) 이 숫자가 철수의 암호 규칙을 통과하는지 확인하는 식을 작성해보겠습니다.
 */

public class A0903개념02_논리와서술형연습 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		// int a = ran.nextInt(900) + 100;
		
		/*
			랜덤의 범위가 커서 확인하기 힘들경우, 랜덤은 주석처리하고,
			아래와같이 임의의 값을 넣어서 테스트할 수 있습니다.		
		 */
		int a = 248;
		System.out.println(a);
		
		int b = a / 100;
		int c = a % 100 / 10;
		int d = a % 10;
		
		boolean e = b % 2 == 0;
		boolean f = c % 2 == 0;
		boolean g = d % 2 == 0;
		boolean h = e && f && g;
		System.out.println(h);
		
	}
}
