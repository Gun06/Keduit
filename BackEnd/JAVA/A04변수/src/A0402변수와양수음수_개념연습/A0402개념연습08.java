package A0402변수와양수음수_개념연습;
/*
[문제]
다음 보기의 계산식을 변수로 설정하고 결과를 출력하시오.

[보기]
24 / -6
-6 / 24
*/
/*
[출력예시]
-4
0
 */

public class A0402개념연습08 {
	public static void main(String[] args) {
		int a = 24;
		int b = -6;
		int c = a / b;
		System.out.println(c);
		
		int d = b / a;
		System.out.println(d);
	}
}
