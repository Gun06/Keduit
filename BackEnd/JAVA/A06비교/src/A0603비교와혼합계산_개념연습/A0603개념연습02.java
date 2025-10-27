package A0603비교와혼합계산_개념연습;
/*
[문제]
다음은 비교 연산과 산술 연산이 혼합된 계산식입니다.
아래 계산식의 결과가 true인지 false인지 예측하시오.  

[보기]
2 * 12 / 3 > -3 + 6 * 4
4 * 4 / 4 < 3 * 7 - 19
180 / 6 / 3 == 3 - 6 * 2
81 / 9 * 8 != -5 * -5 + 6
24 / 4 / 3 >= 6 * 2 - 13
-2 * 3  * 6 <= -12 - 14 * 3
*/
public class A0603개념연습02 {
	public static void main(String[] args) {
		boolean a = 2 * 12 / 3 > -3 + 6 * 4;
		boolean b = 4 * 4 / 4 < 3 * 7 - 19;
		boolean c = 180 / 6 / 3 == 3 - 6 * 2;
		boolean d = 81 / 9 * 8 != -5 * -5 + 6;
		boolean e = 24 / 4 / 3 >= 6 * 2 - 13;
		boolean f = -2 * 3  * 6 <= -12 - 14 * 3;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}
}
