package A0402변수와양수음수_개념연습;
/*
[문제]
다음 보기의 계산식을 변수로 설정하고 결과를 출력하시오.

[보기]
-45 / 3
3 / -45
*/
/*
[출력예시]
-15
0

 */
public class A0402개념연습07 {
	public static void main(String[] args) {
		int a = -45;
		int b = 3;
		int c = a / b;
		System.out.println(c);
		
		int d = b / a;
		System.out.println(d);
	}
}
