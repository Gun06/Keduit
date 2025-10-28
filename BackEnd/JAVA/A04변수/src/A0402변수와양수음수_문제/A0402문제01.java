package A0402변수와양수음수_문제;
/*
[문제]
다음 보기의 계산식을 변수로 설정하고 결과를 출력하시오.

[보기]
9 + -6
-6 + 9
*/

/*
[출력예시]
3
3
 */
public class A0402문제01 {
	public static void main(String[] args) {
		int a = 9;
		int b = -6;
		int c = a + b;
		System.out.println(c);
		
		int d = b + a;
		System.out.println(d);
	}
}
