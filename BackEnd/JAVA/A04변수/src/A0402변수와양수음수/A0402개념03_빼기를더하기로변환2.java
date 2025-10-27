package A0402변수와양수음수;
/*
[빼기를 더하기로 변환2]
양수와 음수의 빼기는 더하기로 변환할 수 있습니다.
예를 들어, 7 - -4에서 빼기 기호(-)가 두 번 연달아 있으면, 이는 부호가 바뀌어 더하기로 변환됩니다.
그 결과 7 + 4로 변환할 수 있습니다.
 */
public class A0402개념03_빼기를더하기로변환2 {
	public static void main(String[] args) {
		int a = 7;
		int b = 4;
		int c = a - -b;
		System.out.println(c);
		int d = a + b;
		System.out.println(d);
	}
}
