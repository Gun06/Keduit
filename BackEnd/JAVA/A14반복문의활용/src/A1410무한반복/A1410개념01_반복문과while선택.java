package A1410무한반복;

import java.util.Random;

/*
	[반복문과 while 선택]
	반복문에는 while문과 for문 두 가지 종류가 있습니다.
	일반적으로 반복 횟수가 정해지지 않았을 때는 while문을 사용하고,
	반복 횟수가 정해졌을 때는 for문을 사용합니다.
	
	예를 들어, 1부터 10 사이의 랜덤 숫자를 저장한 후,
	숫자가 5 이하이면 출력하고, 5 초과이면 출력하지 않는 조건을 생각해봅시다.
	이 과정을 통해 총 10개의 숫자가 출력되면 반복을 종료합니다.
	이처럼 몇 번 반복될지 모르는 상황에서는 while문을 사용하는 것이 적절합니다.
 */

/*
	[출력예시]
	3 3 1 3 3 4 1 1 3 3 
 */

public class A1410개념01_반복문과while선택 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int count = 0;
		
		boolean loop = true;
		while(loop) {
			int r = ran.nextInt(10) + 1;
			if(r < 5) {
				if(r < 5) {
					System.out.print(r + " ");
					count += 1;
					
					if(count == 10) {
						loop = false;
					}
				}
			}
		}
		
	}
}
