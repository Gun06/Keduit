package A0501변수와자릿수_문제;
/*
[문제]
6453의 일의 자리를 0으로 변경하시오.
*/

/*
[출력예시]
6450        
*/
public class A0501문제06 {
	public static void main(String[] args) {
		int a = 6453;
		int _1 = a% 10;
		
		int b = a - _1;
		System.out.println(b);
	}
}
