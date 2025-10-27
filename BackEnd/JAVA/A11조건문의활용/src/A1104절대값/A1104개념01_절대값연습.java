package A1104절대값;

import java.util.Random;

/*
	[절대값 연습]
	-5부터 5 사이의 랜덤 숫자를 생성하고 저장하시오. 
	만약 음수가 나오면, 해당 숫자를 절대값(양수)으로 바꿔서 출력하시오.
 */

/*
	[출력예시]
	-3
	3
 */

public class A1104개념01_절대값연습 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int a = ran.nextInt(11) - 5;
		System.out.println(a);
		
		if(a < 0) {
			a = -a;
			System.out.println(a);
		}
		
	}
}
