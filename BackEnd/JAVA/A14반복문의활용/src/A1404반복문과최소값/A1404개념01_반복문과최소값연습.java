package A1404반복문과최소값;

import java.util.Random;

/*
	[반복문과 최소값 연습]
	1부터 20 사이의 랜덤 숫자를 10번 출력한 후, 
	반복문이 종료되면 그 중에서 가장 작은 수를 출력하시오.
 */

/*
	[출력예시]
	15 17 2 12 16 5 15 10 7 6 
	2
 */

public class A1404개념01_반복문과최소값연습 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int min = 20;
		
		for(int i=0; i<10; i++) {
			int r = ran.nextInt(20) + 1;
			System.out.print(r + " ");
			
			if(min > r) {
				min = r;
			}
		}
		
		System.out.println();
		System.out.println(min);
		
	}
}
