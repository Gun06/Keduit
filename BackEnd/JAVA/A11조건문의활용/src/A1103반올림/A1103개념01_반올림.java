package A1103반올림;

import java.util.Random;

/*
	[문제]
	랜덤숫자 10~99를 저장한후 일의 자리에서 반올림을 하시오.
	반올림이란 4이하는 0으로, 5이상은 10이 되는것을 말한다.
	즉, 14 는 10이되고, 15는 20이된다.
 */

/*
	[출력예시]
	67 
	70
 */

public class A1103개념01_반올림 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int a = ran.nextInt(90) + 10;
		System.out.println(a);
		
		int b = a / 10;
		int c = a % 10;
		if(c >= 5) {
			b += 1;
		}
		
		int d = b * 10;
		System.out.println(d);
		
	}
}
