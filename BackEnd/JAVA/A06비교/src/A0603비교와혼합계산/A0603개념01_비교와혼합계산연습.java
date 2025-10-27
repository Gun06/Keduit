package A0603비교와혼합계산;

/*
	[비교와 혼합 계산 연습]
	다음은 비교 연산과 산술 연산이 혼합된 계산식입니다.
	아래 계산식의 결과가 true인지 false인지 예측하시오.
*/

public class A0603개념01_비교와혼합계산연습 {
	public static void main(String[] args) {
		
		boolean a = 2 + -3 > 7 - 6;
		boolean b = -5 + 1 < 2 - -6;
		boolean c = -5 * 2 == 50 / 5;
		boolean d = 9 - -3 != 75 / 15;
		boolean e = 16 / 8 >= -6 + -3;
		boolean f = -3 * -5 <= 49 / 7;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
	}
}
