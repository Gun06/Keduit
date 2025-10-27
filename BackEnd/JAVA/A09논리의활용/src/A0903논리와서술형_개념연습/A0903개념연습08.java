package A0903논리와서술형_개념연습;
/*
[문제]
철수는 암호 숫자를 만들었습니다. 
암호의 규칙은 다음과 같습니다.
모든 자리의 숫자가 짝수이거나, 모든 자리의 숫자가 홀수인 경우 암호를 통과합니다.
10부터 99 사이의 랜덤 숫자를 저장한 후 출력합니다.
숫자가 암호 규칙을 통과하는지 확인하고, true 또는 false로 출력하시오.    
*/

import java.util.Random;

/*
[출력예시]
82
true    
*/
public class A0903개념연습08 {
	public static void main(String[] args) {
		Random ran = new Random();
		int a = ran.nextInt(90) + 10;
		System.out.println(a);
		int b = a / 10;
		int c = a % 10;
		boolean d = b % 2 == 0 && c % 2 == 0;
		boolean e = b % 2 == 1 && c % 2 == 1;
		
	   
		boolean f = d || e;
		System.out.println(f);
	}
}
