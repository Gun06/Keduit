package A0801논리;

/*
	[논리연산자 !(not)의 활용]
	10이 2보다 크다는 10이 2를 초과하는 수를 의미합니다.
	! 연산자를 활용하여 그 반대의 결과를 출력하겠습니다.
 */

public class A0801개념06_논리연산자not의활용 {
	public static void main(String[] args) {
		
		int a = 10;
		
		boolean b = a > 2;
		boolean c = !b;
		System.out.println(c);
		
	}
}
