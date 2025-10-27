package A1502반복문키워드continue;

import java.util.Random;

/*
	[반복문 옵션 continue]
	반복문 안에서 continue를 실행하면, 
	해당 반복문의 나머지 코드는 실행되지 않고 바로 조건식으로 이동합니다. 
	
	예를 들어, 1부터 9 사이의 랜덤 숫자 2개를 저장하고 그 숫자의 합이 10이 될 때까지 
	반복하는 프로그램에서 continue를 사용하는 예시를 들어보겠습니다.
 */

/*
	[출력예시]
	8 7
	8 6
	4 7
	9 8
	8 2
	10
 */

public class A1502개념01_continue {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		while(true) {
			int a = ran.nextInt(9) + 1;
			int b = ran.nextInt(9) + 1;
			int total = a + b;
			System.out.println(a + " " + b);
			
			if(total != 10) {
				// continue를 만나면 즉시 while(true)으로 이동합니다.
				continue;
			}
			System.out.println(total);
			break;
		}
		
	}
}
