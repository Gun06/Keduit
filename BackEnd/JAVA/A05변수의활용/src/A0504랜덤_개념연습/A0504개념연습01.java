package A0504랜덤_개념연습;

import java.util.Random;

/*
[문제]
철수는 주사위 게임을 하고 있습니다. 
이 게임에서 두 개의 주사위를 사용합니다. 
첫 번째 주사위는 -3에서 2까지의 숫자가 적혀 있고, 두 번째 주사위는 1에서 6까지의 숫자가 적혀 있습니다. 
두 주사위를 던져서 각각의 숫자와 그 합을 출력하시오.        
*/

/*
[출력예시]
-2
6
4
*/
public class A0504개념연습01 {
	public static void main(String[] args) {
		Random ran = new Random();
		int a = ran.nextInt(6) -3;
		int b = ran.nextInt(6) + 1;
		int c = a + b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
