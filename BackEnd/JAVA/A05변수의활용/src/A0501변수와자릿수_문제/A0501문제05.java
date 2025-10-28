package A0501변수와자릿수_문제;
/*
[문제]
6453의 십의 자리를 0으로 변경하시오.
*/

/*
[출력예시]
6403        
*/
public class A0501문제05 {
	public static void main(String[] args) {
		int a = 6453;
		int _1000 = a / 1000;
		int _100 = a % 1000 / 100;
		int _1 = a % 10;
		
		int b = _1000 *1000 + _100 * 100 + _1;
		System.out.println(b);
	}
}
