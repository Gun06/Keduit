package A1202조건문옵션elseif;

import java.util.Random;

/*
	[중첩 학점 else if 연습]
	0에서 100 사이의 랜덤 숫자를 시험 점수로 저장합니다.
	시험 점수가 100~91이면 A학점, 90~81이면 B학점, 80 이하는 "재시험"입니다.
	만점이거나, A학점과 B학점의 일의 자리가 8점 이상이면 + 기호를 추가하시오.
	단, else if와 else를 사용하시오.
 */

/*
	[출력예시]
	84 4
	B
	[출력예시]
	69 9
	재시험
 */

public class A1202개념08_중첩학점elseif연습 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int a = ran.nextInt(101);
		System.out.println(a);
		
		int b = a % 10;
		System.out.println(b);
		
		if(a <= 80) {
			System.out.println("재시험");
		} else if(a >= 90) {
			if(b >= 8) {
				System.out.println("B+");
			}
			if(b < 8) {
				System.out.println("B");
			}
		} else if(a <= 99) {
			if(b >= 8) {
				System.out.println("A+");
			}
			if(b < 8) {
				System.out.println("A");
			}
		} else if(a == 100) {
			System.out.println("A+");
		}
		
		
	}
}
