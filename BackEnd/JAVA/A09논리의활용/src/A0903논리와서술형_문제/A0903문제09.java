package A0903논리와서술형_문제;
/*
[문제]
철수는 암호 숫자를 만들었습니다. 
이 암호의 규칙은 두 자리 숫자 중 하나는 짝수이고, 다른 하나는 홀수여야 통과됩니다. 
반대 순서도 상관없습니다.
10부터 99 사이의 랜덤 숫자를 생성한 후 출력합니다.
이 숫자가 암호 규칙을 통과하는지 확인하고, true 또는 false로 출력하시오.    
*/

import java.util.Random;

/*
[출력예시]
27
true    
*/
public class A0903문제09 {
	public static void main(String[] args) {
		Random ran = new Random();
		int a = ran.nextInt(90) + 10;
		System.out.println(a);
		int b = a / 10;
		int c = a % 10;
		boolean d = b % 2 == 0 && c % 2 == 1;
		boolean e = b % 2 == 1 && c % 2 == 0;
		
		boolean f = d || e;
		System.out.println(f);
	}
}
