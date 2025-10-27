package A0501변수와자릿수_개념연습;
/*
[문제]
7951의 각 자릿수를 분리하여 천의 자릿수, 백의 자릿수, 십의 자릿수, 일의 자릿수를 출력하시오.
*/

/*
[출력예시]
7
9
5
1        
*/
public class A0501개념연습01 {
	public static void main(String[] args) {
		int a = 7951;
		int _1000 = a / 1000;
		int _100 = a % 1000 / 100;
		int _10 = a % 100 / 10;
		int _1 = a % 10;
		System.out.println(_1000);
		System.out.println(_100);
		System.out.println(_10);
		System.out.println(_1);
	}
}
