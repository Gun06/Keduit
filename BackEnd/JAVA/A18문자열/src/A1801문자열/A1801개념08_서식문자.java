package A1801문자열;
/*
출력문의 종류
1. println()
2. print()
---------------------
3. printf()
	1) f = format(서식)
	2) 서식 문자의 종류
		%알파벳
		%d		decimal,정수
		%f		float,실수
		%c		character,문자한개
		%s		String,문자여러개
*/
public class A1801개념08_서식문자 {
	public static void main(String[] args) {
		

		
		System.out.println(10);
		System.out.printf("%d", 10);
		System.out.println();
		
		System.out.println(3.14234234234234);
		// 소수점 개수는 기본 6자리
		System.out.printf("%.2f", 3.14234234234234);
		System.out.println();
		
		System.out.println('B');
		System.out.printf("%c", 'B');
		System.out.println();
		
		System.out.println("B형");
		System.out.printf("%s", "B형");
		System.out.println();
		
		// 여러 변수를 표현할 때 유용하다.
		System.out.println(10 + " + " + 3 + " = " + 13);
		System.out.printf("%d + %d = %d", 10, 3, 13);
		
	}
}



