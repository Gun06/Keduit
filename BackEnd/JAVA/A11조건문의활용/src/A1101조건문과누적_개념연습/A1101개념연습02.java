package A1101조건문과누적_개념연습;
/*
[문제]
100부터 999 사이의 랜덤 숫자를 저장하고,
각 자리수가 짝수인 누적을 구하시오.    
*/

import java.util.Random;

/*
[출력예시]
249
6    
*/
public class A1101개념연습02 {
	public static void main(String[] args) {
		Random ran = new Random();
		int r = ran.nextInt(900) + 1;
		System.out.println(r);
		int a = r / 100;
		int b = r % 100 / 10;
		int c = r % 10;

	    int total = 0;
	    if(a % 2 == 0) {
	        total = total + a;
	    }
	    if(b % 2 == 0) {
	        total = total + b;
	    }
	    if(c % 2 == 0) {
	        total = total + c;
	    }
	    System.out.println(total);

		
	}
}
