package A0703배수;

/*
	[짝수]
	짝수란, 정수 중에서 2로 나눠떨어지는 정수들을 의미합니다.
	파이썬에서는 0은 짝수로 취급합니다.
	
	[홀수]
	홀수는 짝수가 아닌 수를 의미합니다.
	
	[짝수 판별]
	짝수는 2의 배수임을 증명하면 그것이 짝수를 판별하는 식입니다.
	2의 배수는 3가지 방법으로 판별할 수 있으며 짝수를 판별할 수도 있습니다.
	(1) 4 % 2 == 0
	(2) 4 % 2 != 1
	(3) 4 % 2 < 1
	
	[홀수 판별]
	홀수는 2의 배수가 아닌 수를 증명하면 그것이 홀수를 판별하는 식입니다.
	2의 배수가 아님을 아래 3가지 방법으로 판별할 수 있으며 홀수를 판별할 수도 있습니다.
	(1) 5 % 2 != 0 
	(2) 5 % 2 > 0 
	(3) 5 % 2 == 1 
 */

public class A0703개념02_짝수홀수 {
	public static void main(String[] args) {
		
		// 짝수 판별식 3개
		boolean a = 4 % 2 == 0;
		System.out.println(a);
		
		a = 4 % 2 != 1;
		System.out.println(a);
		
		a = 4 % 2 < 1;
		System.out.println(a);
		
		// 홀수 판별식 3개
		boolean b = 5 % 2 != 0;
		System.out.println(b);
		
		b = 5 % 2 > 0;
		System.out.println(b);
		
		b = 5 % 2 == 1;
		System.out.println(b);
		
	}
}












