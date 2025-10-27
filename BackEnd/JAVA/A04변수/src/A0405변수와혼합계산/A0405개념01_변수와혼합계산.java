package A0405변수와혼합계산;
/*
[변수와 혼합 계산]
연산자가 두 개 이상 포함된 식을 혼합 계산식이라고 부릅니다.
혼합 계산식에서는 연산자의 우선순위를 고려하여 계산됩니다.
 */
public class A0405개념01_변수와혼합계산 {
	public static void main(String[] args) {
		int a = 6;
		int b = 5;
		int c = 4;
		
		int d = a + b * c;
		System.out.println(d);
		
		d = a - b * c;
		System.out.println(d);

		d = a + b / c;
		System.out.println(d);
		
		d = a - b / c;
		System.out.println(d);
		
		d = a + b % c;
		System.out.println(d);
		
		d = a + b % c;
		System.out.println(d);
	}
}
