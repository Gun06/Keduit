package A1110조건문과중첩_개념연습;

import java.util.Random;

/*
[문제]
철수는 마블 게임을 하고 있습니다. 
아래 조건을 모두 만족하는 식을 작성하시오.

[조건]
(1) 철수는 현재 0의 위치에 있습니다.
(2) 주사위 두 개를 던져 나온 숫자의 합만큼 철수는 현재 위치에서 이동합니다.
	주사위는 1부터 6까지의 눈금을 가지고 있습니다.
(3) 만약 주사위 두 개의 숫자가 같으면, "찬스!"라는 메시지를 출력합니다.
	그리고 추가 이동 기회가 주어집니다.
	추가 이동 기회란, 주사위 한 개를 다시 던져 그 숫자가 짝수이면, 
	나온 숫자만큼 앞으로 이동합니다.    
*/

/*
[출력예시]
2 3
5

[출력예시]
5 5
찬스!
2
12    
*/
public class A1110개념연습03 {
	public static void main(String[] args) {
		Random ran = new Random();
		int a = 0;
		int r1 = ran.nextInt(6) + 1;
		int r2 = ran.nextInt(6) + 1;
		System.out.println(r1 + " " + r2);

		a = r1 + r2;
		if(r1 == r2) {
			System.out.println("찬스!");
			int r3 = ran.nextInt(6) + 1;
			System.out.println(r3);
			if(r3 % 2 == 0) {
				a = a + r3;
			}
		}
		System.out.println(a);
	}
}
