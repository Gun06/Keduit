package A0903논리와서술형_개념연습;
/*
[문제]    
철수는 암호 숫자를 만들었습니다. 
암호의 규칙은 숫자 5가 하나라도 포함되어 있으면 통과입니다.
100부터 999 사이의 랜덤 숫자를 생성한 후 출력합니다. 
숫자가 암호 규칙을 통과하는지 확인하고, true 또는 false로 출력하시오.    
*/

import java.util.Random;

/*
[출력예시]
621
false  

[출력예시]
511
true
*/

public class A0903개념연습07 {
	public static void main(String[] args) {
		Random ran = new Random();
		int a = ran.nextInt(900) + 100;
		System.out.println(a);
		int b = a / 100;
		int c = a % 100 / 10;
		int d = a % 10;
		boolean e = b == 5 || c == 5 || d == 5;
		  System.out.println(e);
	}
}
