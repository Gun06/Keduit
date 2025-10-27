package A1108조건문과개수;

import java.util.Random;

/*
	[조건문과 개수 연습]
	조건문을 사용하여 특정 조건이 충족될 때마다 누적 개수를 구할 수 있습니다.
	
	100부터 999 사이의 랜덤 숫자를 생성하여 저장합니다.
	각 자리수(백의 자리, 십의 자리, 일의 자리)마다 숫자 5가 몇 개 있는지 확인하고, 그 개수를 출력하시오.
 */

/*
	[출력예시]
	756
	1
 */

public class A1108개념01_조건문과개수연습 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int a = ran.nextInt(900) + 100;
		System.out.println(a);
		
		int b = a / 100;
		int c = a % 100 / 10;
		int d = a % 10;
		
		int count = 0;
		if(b == 5) {
			count += 1;
		}
		if(c == 5) {
			count += 1;
		}
		if(d == 5) {
			count += 1;
		}
		System.out.println(count);
		
	}
}
