package A0504랜덤_개념연습;
/*
[문제]
랜덤숫자 10에서 40 사이의 숫자를 저장한 후, 일의 자리를 0으로 변경하시오.    
*/

import java.util.Random;

/*
[출력예시]
37
30
*/
public class A0504개념연습04 {
	public static void main(String[] args) {
		Random ran = new Random();
		int a = ran.nextInt(31) + 10;
		int _10 = a / 10;
		int _1 = a % 10;
		int b = _10 * 10;
		
		
		System.out.println(a);
		System.out.println(b);
	}
}
