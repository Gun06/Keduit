package A0501변수와자릿수_개념연습;
/*
[문제]
6453의 각 자릿수를 분리한 후, 천의 자리와 일의 자릿수를 더한 값을 출력하시오.
*/

/*
[출력예시]
9        
*/
public class A0501개념연습03 {
	public static void main(String[] args) {
		int a = 6453;
		int _1000 = a / 1000;
		int _1 = a % 10;
		System.out.println(_1000 + _1);
	}
}
