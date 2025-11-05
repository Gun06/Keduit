package A1203조건문종류switch_문제;

import java.util.Random;

/*
	[문제]
		[1] 1~99 사이의 랜덤 숫자를 저장한다.
		
		랜덤 숫자 를 각자리별로 저장후, 3이나 6이나 9의 개수가
		[2-1] 2개이면, 짝짝을 출력한다.
		[2-2] 1개이면, 짝을 출력한다.
		[2-3] 0개이면, 해당 숫자를 출력하시오.
		
		[예]
			33	==> 짝짝
			16	==> 짝
			7	==> 7
*/
public class A1203문제04 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int num = 0;
		int x = 0;
		int y = 0;
		int count = 0;
		
		num = ran.nextInt(99) + 1;
		System.out.println(num);
		
		x = num / 10;
		y = num % 10;
		System.out.println("x = " + x + ", y = " + y);

		count = 0;
		if(x == 3 || x == 6 || x == 9) {
			count = count + 1;
		}
		if(y == 3 || y == 6 || y == 9) {
			count = count + 1;
		}
		System.out.println("count = " + count);

		switch(count){
			case 2 : 
				System.out.println("짝짝");
				break;
			case 1 : 
				System.out.println("짝");
				break;
			case 0 : 
				System.out.println(num);
				break;
		}
	}
}
