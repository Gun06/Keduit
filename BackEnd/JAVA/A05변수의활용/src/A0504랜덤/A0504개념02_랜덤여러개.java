package A0504랜덤;

import java.util.Random;

/*
	[랜덤 여러 개]
	1부터 6까지 눈금이 있는 주사위를 두 개 던져서 그 합을 출력해 보겠습니다.
	 
	[출력예시]
	6 + 5 = 11	 
*/

public class A0504개념02_랜덤여러개 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int a = ran.nextInt(6) + 1;
		int b = ran.nextInt(6) + 1;
		int c = a + b;
		
		System.out.println(a + " + " + b + " = " + c);
		
	}
}
