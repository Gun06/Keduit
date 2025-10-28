package A0402변수와양수음수_문제;
/*
[문제]
다음 보기의 계산식을 변수로 설정하고 결과를 출력하시오.

[보기]
-9 - 12
12 - -9
*/
/*
[출력예시]
-21
21
 */
public class A0402문제03 {
	public static void main(String[] args) {
		int a = -9;
		int b = 12;
		int c = a - b;
		System.out.println(c);
		
		int d = b - a;
		System.out.println(d);
	}
}
