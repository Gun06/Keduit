package A1001조건문if;

import java.util.Random;

/*
	[조건문 연습]
	변수 a에 5를 저장합니다.
	1부터 10 사이의 랜덤 숫자를 변수 b에 저장합니다.
	b가 a보다 크면 "크다"를 출력합니다.
	b가 a보다 작으면 "작다"를 출력합니다.
	b가 a와 같으면 "같다"를 출력합니다.
 */

/*
	[출력예시]
	5 5
	같다
 */

public class A1001개념02_조건문연습 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int a = 5;
		
		int b = ran.nextInt(10) + 1;
		System.out.println(a + " " + b);
		
		if(b > a) {
			System.out.println("크다");
		}
		if(b == a) {
			System.out.println("같다");
		}
		if(b < a) {
			System.out.println("작다");
		}
	}
}
