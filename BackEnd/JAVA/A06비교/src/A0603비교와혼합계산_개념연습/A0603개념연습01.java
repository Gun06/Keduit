package A0603비교와혼합계산_개념연습;
/*
[문제]
다음은 비교 연산과 산술 연산이 혼합된 계산식입니다.
아래 계산식의 결과가 true인지 false인지 예측하시오.

[보기]
9 + -6 > 9 - 12
-8 + 5 < 5 - -4
-2 * -5 == 50 / 5
45 / 3 != 12 - -4
24 / 3 >= -8 - 5
-7 * -3 <= 28 / 7
*/
public class A0603개념연습01 {
	public static void main(String[] args) {
		boolean a = 9 + -6 > 9 - 12;
		boolean b = -8 + 5 < 5 - -4;
		boolean c = -2 * -5 == 50 / 5;
		boolean d = 45 / 3 != 12 - -4;
		boolean e = 24 / 3 >= -8 - 5;
		boolean f = -7 * -3 <= 28 / 7;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}
}
