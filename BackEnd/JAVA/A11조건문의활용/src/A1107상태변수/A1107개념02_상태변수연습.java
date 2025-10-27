package A1107상태변수;

import java.util.Random;

/*
  	[상태변수 연습]
	a = 20
	b = 3
	
	state에 1부터 4 사이의 랜덤 숫자를 저장합니다.
	state의 값에 따라 아래 조건에 맞게 계산한 후 결과를 출력하시오.
	
	[조건]
	(1) state가 1이면 a와 b를 더합니다.
	(2) state가 2이면 a에서 b를 뺍니다.
	(3) state가 3이면 b에서 a를 뺍니다.
	(4) state가 4이면 a와 b를 곱합니다.   
 */

/*
	[출력예시]
   	20 3
	4
	60
 */

public class A1107개념02_상태변수연습 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int a = 20;
		int b = 3;
		System.out.println(a + " " + b);
		
		int state = ran.nextInt(4) + 1;
		
		System.out.println(state);
		
		int c = 0;
		if(state == 1) {
			c = a + b; 
		}
		if(state == 2) {
			c = a - b; 
		}
		if(state == 3) {
			c = b - a; 
		}
		if(state == 4) {
			c = a * b; 
		}
		System.out.println(c);
		
	}
}
