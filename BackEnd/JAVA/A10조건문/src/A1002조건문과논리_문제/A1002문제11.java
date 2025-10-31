package A1002조건문과논리_문제;
/*
[문제]
철수는 암호 숫자를 만들었습니다. 
암호 숫자의 규칙은 숫자 5가 하나라도 포함되어 있으면 통과하는 것입니다. 
100부터 999 사이의 랜덤 숫자를 저장한 후, 해당 숫자가 암호를 통과하면 "o"를 출력하고, 
통과하지 못하면 "x"를 출력하는 프로그램을 작성하시오.    
*/

import java.util.Random;

/*
[출력예시]
251
o  

[출력예시]
380
x        
*/
public class A1002문제11 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int r = ran.nextInt(900) + 100;
		System.out.println(r);
		
		int a = r / 100;
		int b = r % 100 / 10;
		int c = r % 10;
		
		boolean e = a == 5 || b == 5 || c == 5;

		if(e) {
		    System.out.println("o");
		}
		if(!e) {
		    System.out.println("x");
		}
	}
}
