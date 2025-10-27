package A0501변수와자릿수_개념연습;
/*
[문제]
6453의 백의 자리를 0으로 변경하시오.
*/

/*
[출력예시]
6053        
*/

public class A0501개념연습04 {
	public static void main(String[] args) {
		int a = 6453;
		int _1000 = a / 1000;
		int _10 = a % 100 / 10;
		int _1 = a % 10;
		
		int b = _1000 *1000 + _10 * 10 + _1;
		System.out.println(b);
	}
}
