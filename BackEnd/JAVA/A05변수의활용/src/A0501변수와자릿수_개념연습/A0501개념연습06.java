package A0501변수와자릿수_개념연습;
/*
[문제]
6453의 일의 자리를 0으로 변경하시오.
*/

/*
[출력예시]
6450        
*/
public class A0501개념연습06 {
	public static void main(String[] args) {
		int a = 6453;
		int _1 = a% 10;
		
		int b = a - _1;
		System.out.println(b);
	}
}
