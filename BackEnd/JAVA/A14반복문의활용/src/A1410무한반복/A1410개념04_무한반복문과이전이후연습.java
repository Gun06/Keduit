package A1410무한반복;

import java.util.Random;

/*
	[무한 반복문과 이전 이후 연습]
	처음 숫자는 1로 시작하며, 1부터 100 사이의 랜덤 숫자를 무한히 출력합니다. 
	다음에 나오는 숫자가 이전 숫자보다 작거나 같으면 프로그램을 종료하시오.
 */

/*
	[출력예시]
	1 23 32 80 1
	
	[출력예시]
	1 69 84 67
 */

public class A1410개념04_무한반복문과이전이후연습 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int num = 1;
		System.out.print(num + " ");
		
		boolean loop = true;
		while(loop) {
			int r = ran.nextInt(100) + 1;
			System.out.print(r + " ");
			
			if(r <= num) {
				loop = false;
			} else {
				num = r;
			}
		}
	}
}
