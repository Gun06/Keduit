package A0402변수와양수음수;
/*
	[빼기의 교환법칙 불가]
	빼기의 경우, 숫자의 순서를 바꾸면 결과가 달라집니다.
	예를 들어, 5 - 3은 2이지만, 3 - 5는 -2가 됩니다.
	이처럼 빼기는 숫자의 순서가 매우 중요하기 때문에, 교환법칙이 적용되지 않습니다.
 */
public class A0402개념06_빼기의교환법칙불가 {
	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		int c = a - b;
		System.out.println(c);
		
		int d = b - a;
		System.out.println(d);
	}
}
