package A0903논리와서술형_개념연습;
/*
[문제]
1부터 9 사이의 랜덤 숫자 3개를 저장합니다.
세 개의 랜덤 숫자를 출력합니다.
세 개의 랜덤 숫자가 모두 같은 수인지 확인하고, true 또는 false로 출력하시오.    
*/

import java.util.Random;

/*
[출력예시]
8
5
7
false   
*/
public class A0903개념연습01 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		int a = ran.nextInt(9) + 1;
		int b = ran.nextInt(9) + 1;
		int c = ran.nextInt(9) + 1;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	    boolean d = a == b && a == c;
	    System.out.println(d);
	}
}
