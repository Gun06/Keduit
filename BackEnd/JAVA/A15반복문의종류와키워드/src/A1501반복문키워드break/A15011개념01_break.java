package A1501반복문키워드break;

import java.util.Random;

/*
	[반복문 옵션 break]
	break는 반복문 안에서 즉시 종료하고 싶을 때 사용합니다.
	
	예를 들어, 무한 반복문 안에서 1부터 10사이의 랜덤 숫자 하나를 저장하고, 
	숫자가 5가 나오면 반복문을 종료할 때 break를 사용할 수 있습니다.
 */

/*
	[출력예시]
	2 1 1 9 7 9 4 5
 */

public class A15011개념01_break {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		// break를 사용할 때에는 조건식을 true로 사용할 수 있습니다.
		while(true) {
			int r = ran.nextInt(10) + 1;
			System.out.print(r + " ");
			
			if(r == 5) {
				// 반복문이 즉시 종료됩니다.
				break;
			}
		}
		
	}
}
