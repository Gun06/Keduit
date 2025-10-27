package A1402반복문과개수;

import java.util.Random;

/*
	[문제]
	1부터 9 사이의 랜덤 값을 3개 출력합니다.
	모든 숫자가 5보다 크면 "당첨"을 출력하고, 
	하나라도 1부터 4 사이의 숫자가 나오면 "꽝"을 출력합니다.
 */

/*
	[출력예시]
	6 6 9 
	당첨
	
	[출력예시]
	5 3 1 
	꽝
 */

public class A1402개념05_반복문전부일치연습 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int count = 0;
		for(int i=0; i<3; i++) {
			int r = ran.nextInt(9) + 1;
			System.out.print(r + " ");
			
			if(r >= 5) {
				count += 1;
			}
		}
		
		System.out.println();
		if(count == 3) {
			System.out.println("당첨");
		} else {
			System.out.println("꽝");
		}
	}
}
