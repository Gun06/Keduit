package A1405반복문과상태변수;

import java.util.Random;

/*
	[반복문과 상태 변수 연습]
	a = 100
	
	1부터 2 사이의 랜덤 숫자를 저장합니다.
	랜덤 숫자가 1이면 a에서 5씩 감소한 값을 누적하고,
	랜덤 숫자가 2이면 a에서 5씩 증가한 값을 누적합니다.
	이 행동을 10번 반복하시오.
 */

/*
	[출력예시]
	1 95
	1 90
	1 85
	2 90
	2 95
	1 90
	2 95
	2 100
	2 105
	1 100
 */

public class A1405개념01_반복문과상태변수연습 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int a = 100;
		
		for(int i=0; i<10; i++) {
			int r = ran.nextInt(2) + 1;
			
			if(r == 1) {
				a -= 5;
			}
			if(r == 2) {
				a += 5;
			}
			System.out.println(r + " " + a);
		}
		
	}
}
