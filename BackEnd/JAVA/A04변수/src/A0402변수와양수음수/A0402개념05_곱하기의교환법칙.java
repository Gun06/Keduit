package A0402변수와양수음수;
/*
	[곱하기의 교환법칙]
	곱하기의 경우, 숫자의 순서를 바꾸어도 결과가 같습니다.
	예를 들어, 3 * 5와 5 * 3은 둘 다 15이므로, 곱하기의 교환법칙이 성립합니다.
 */
public class A0402개념05_곱하기의교환법칙 {
	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		int c = a * b;
		System.out.println(c);
		
		int d = b * a;
		System.out.println(d);
	}
}
