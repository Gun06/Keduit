package A1002조건문과논리;

import java.util.Random;

/*
	[조건문의 간결한 표현2]
	철수는 놀이동산에 갔습니다. 
	바이킹을 타기 위해서는 키가 135cm 이상 190cm 이하여야 합니다.
	철수의 키를 120cm에서 200cm 사이의 랜덤 값으로 저장합니다.
	철수가 바이킹을 탈 수 있는지 확인합니다. 
	키가 135cm 이상 190cm 이하일 경우, "바이킹 이용 가능"으로 출력하고, 
	그렇지 않으면 "바이킹 이용 불가"라고 출력합니다.
 */

/*
	[출력예시]
	127
	바이킹 이용 불가
	바이킹 이용 불가
 */

public class A1002개념03_조건문의간결한표현2 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int a = ran.nextInt(81) + 120;
		System.out.println(a);
		
		if(135 <= a && a <= 190) {
			System.out.println("바이킹 이용 가능");
		}
		if(190 < a || a < 135) {
			System.out.println("바이킹 이용 불가");
		}
		
		// 간결한 표현
		boolean b = 135 <= a && a <= 190;
		boolean c = 190 < a || a < 135;
		
		if(b) {
			System.out.println("바이킹 이용 가능");
		}
		if(!b) {
			System.out.println("바이킹 이용 불가");
		}
		
	}
}
