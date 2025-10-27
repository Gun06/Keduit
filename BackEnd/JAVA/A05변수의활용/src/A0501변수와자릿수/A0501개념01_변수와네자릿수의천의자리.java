package A0501변수와자릿수;

/*
	[변수와 천의 자릿수]
	천의 자리를 구하려면 4128을 1000으로 나눈 몫을 구해야 합니다.
	4128을 1000으로 나누면 몫이 4가 되어 천의 자리는 4입니다.
 */

public class A0501개념01_변수와네자릿수의천의자리 {
	public static void main(String[] args) {
		
		int a = 4128;
		int b = a / 1000;
		System.out.println(b);
		
	}
}
