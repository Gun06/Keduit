package A1106최소값;

import java.util.Random;

/*
	[조건문과 최소값 연습]
	최소값은 주어진 값들 중에서 가장 작은 값을 의미합니다.
	
	숫자 5개를 1부터 1000 사이에서 랜덤으로 생성하여 저장합니다.
	5개의 랜덤 숫자를 비교하여 그 중 가장 작은 수(MIN)를 출력하시오.
 */

/*
	[출력예시]
	837 911 510 621 616
	510
 */

public class J1106개념01_조건문과최소값연습 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int a = ran.nextInt(1000) + 1;
		int b = ran.nextInt(1000) + 1;
		int c = ran.nextInt(1000) + 1;
		int d = ran.nextInt(1000) + 1;
		int e = ran.nextInt(1000) + 1;
		System.out.println(a + " " + b + " " + c + " " + d + " " + e);
		
		// 이 부분이 최소값 개념의 핵심입니다.
		int min = 1000;		// max와 반대로 가장 큰 값을 저장한 후 시작합니다.
		
		if(a < min) {
			min = a;
		}
		if(b < min) {
			min = b;
		}
		if(c < min) {
			min = c;
		}
		if(d < min) {
			min = d;
		}
		if(e < min) {
			min = e;
		}
		System.out.println(min);
		
	}
}
