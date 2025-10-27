package A0402변수와양수음수;
/*
	[나누기의 교환법칙 불가]
	나누기의 경우, 숫자의 순서를 바꾸면 결과가 달라집니다.
	예를 들어, 3 / 5는 1이지만, 5 / 3은 0 이됩니다.
	이처럼 나누기는 숫자의 순서가 매우 중요하기 때문에, 교환법칙이 적용되지 않습니다.
 */
public class A0402개념07_나누기의교환법칙불가 {
	public static void main(String[] args) {
		
		int a = 3;
		int b = 5;
		int c = a / b;
		System.out.println(c);
		
		int d = b / a;
		System.out.println(d);
	}
}
