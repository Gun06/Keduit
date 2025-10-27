package A0501변수와자릿수;

/*
	[변수와 일의 자릿수]
	일의 자리를 구하려면 4128에서 천의 자리, 백의 자리, 십의 자리를 제외한 나머지를 구합니다.
	4128을 10으로 나눈 나머지를 구하면 일의 자리는 8입니다.      
 */

public class A0501개념04_변수와네자릿수의일의자리 {
	public static void main(String[] args) {
		
		int a = 4128;
		int b = a % 10;
		System.out.println(b);
		
	}
}
