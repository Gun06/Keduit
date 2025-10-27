package A0402변수와양수음수;
/*
[빼기를 더하기로 변환1]
양수와 양수의 빼기는 양수와 음수의 더하기로 변환할 수 있습니다.
예를 들어, 7 - 4에서 빼기 기호(-)를 4에 부착하여 음수로 바꾸면 7 + -4로 변환할 수 있습니다.
 */
public class A0402개념02_빼기를더하기로변환1 {
	public static void main(String[] args) {
		int a = 7;
		int b = 4;
		int c = a - b;
		System.out.println(c);
		
		int d = a + -b;
		System.out.println(d);
	}
}
