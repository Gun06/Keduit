package A1002조건문과논리_개념연습;
/*
	[문제]
	철수는 암호 숫자의 규칙을 만들었습니다. 
	암호 숫자는 세 자리의 숫자이면서 모든 자리의 숫자가 짝수여야 합니다. 
	100부터 999 사이의 숫자를 랜덤으로 저장한 후, 
	그 숫자가 철수의 암호 규칙을 통과하면 "o"를 출력하고, 
	통과하지 못하면 "x"를 출력하는 프로그램을 작성하시오.    
*/

import java.util.Random;
	
/*
	[출력예시]
	573
	x  
	
	[출력예시]
	680
	o        
*/
public class A1002개념연습07 {
	public static void main(String[] args) {
		Random ran = new Random();
		int r = ran.nextInt(900) + 100;
		System.out.println(r);
		int a = r / 100;
		int b = r % 100 / 10;
		int c = r % 10;
		
		 boolean d = a % 2 == 0;
		 boolean e = b % 2 == 0;
		 boolean f = c % 2 == 0;
		 boolean g = d && e && f;

		    if(g) {
		    	System.out.println("o");
		    }
		    if(!g) {
		    	System.out.println("x");
		    }
	}
}
