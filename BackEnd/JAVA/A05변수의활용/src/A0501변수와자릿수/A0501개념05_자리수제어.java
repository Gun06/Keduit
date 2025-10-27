package A0501변수와자릿수;

/*
	[자리수 제어]
	숫자48에서 일의자리를 0으로 변경하시오.
	
	[출력예시]
	48 
	40
 */

public class A0501개념05_자리수제어 {
	public static void main(String[] args) {
		
		int a = 48;
		int b = a / 10;
		int c = b * 10;
		System.out.println(a);
		System.out.println(c);
		
	}
}
