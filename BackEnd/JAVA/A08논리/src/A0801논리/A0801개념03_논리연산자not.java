package A0801논리;

/*
	[!(not) 연산자]
	! 연산자는 참(true)이면 거짓(false)으로 변환하고, 
	반대로 거짓(false)이면 참(true)으로 변환합니다.
 */

public class A0801개념03_논리연산자not {
	public static void main(String[] args) {
		
		System.out.println(!(10 == 10));		// !true	=> false
		System.out.println(!(10 != 10));		// !false	=> true
		
	}
}
