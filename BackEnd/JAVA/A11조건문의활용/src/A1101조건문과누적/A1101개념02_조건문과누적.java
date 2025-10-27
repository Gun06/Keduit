package A1101조건문과누적;

import java.util.Random;

/*
	[조건문과 누적]
	조건문을 사용하여 특정 조건을 만족하는 값만을 누적할 수 있습니다.
	
	100부터 999 사이의 랜덤 숫자를 저장하고,
	각 자리수가 3보다 크면 누적을 구해보겠습니다.
 */

public class A1101개념02_조건문과누적 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int a = ran.nextInt(900) + 100;
		System.out.println(a);
		
		int b = a / 100;
		int c = a % 100 / 10;
		int d = a % 10;
		
		/*
			total 변수를 if문 밖에 선언되어 있지 않으면, 오류가 발생합니다.
			누적을 위해 total변수를 미리 if문 밖에 선언해야 합니다.		
		 */
		int total = 0;
		if(b > 3) {
			total = total + b;
		}
		if(c > 3) {
			total = total + c;
		}
		if(d > 3) {
			total = total + d;
		}
		System.out.println(total);
		
	}
}
