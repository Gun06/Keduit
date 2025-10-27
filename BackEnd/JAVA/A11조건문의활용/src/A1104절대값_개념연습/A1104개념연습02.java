package A1104절대값_개념연습;

import java.util.Random;

/*
[문제]
민수와 철수의 시험 점수를 0에서 100 사이 랜덤 숫자로 5점 단위로 저장합니다.
민수의 점수와 철수의 점수 차이를 계산하시오.
차이를 절대값(양수)으로 구하시오.    
*/

/*
[출력예시]
45 90
-45
45    
*/
public class A1104개념연습02 {
	public static void main(String[] args) {
		Random ran = new Random();
		int r1 = ran.nextInt(21);
		r1 = r1 * 5;
		int r2 = ran.nextInt(21);
		r2 = r2 * 5;
		System.out.println(r1 + " " + r2);
		int a = r1 - r2;
		System.out.println(a);
	    if(a < 0) {
	        a = -a;
	        System.out.println(a);
	    }
	}
}
