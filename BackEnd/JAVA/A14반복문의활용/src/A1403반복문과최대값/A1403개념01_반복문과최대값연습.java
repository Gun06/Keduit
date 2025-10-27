package A1403반복문과최대값;

import java.util.Random;

/*
	[반복문과 최대값 연습]
	1부터 20 사이의 랜덤 숫자를 10번 출력한 후, 
	반복문이 종료되면 그 중에서 가장 큰 수를 출력하시오.
 */

/*
	[출력예시]
	16 13 8 3 9 18 10 10 10 6 
	18
 */

public class A1403개념01_반복문과최대값연습 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int max = 1;
		for(int i=0; i<10; i++) {
			int r = ran.nextInt(20) + 1;
			System.out.print(r + " ");
			
			if(max < r) {
				max = r;
			}
		}
		
		System.out.println();
		System.out.println(max);
		
	}
}
