package A1002조건문과논리_개념연습;

import java.util.Random;

/*
    [문제]
    철수는 암호 숫자를 만들었습니다. 
    암호 숫자의 규칙은 모든 자리의 숫자가 짝수이거나, 모든 자리의 숫자가 홀수이면 통과입니다. 
    10부터 99 사이의 랜덤 숫자를 저장한 후, 그 숫자가 암호를 통과하면 "o"를 출력하고, 
    통과하지 못하면 "x"를 출력하는 프로그램을 작성하시오.    
*/

/*
    [출력예시]
    64
    o   
    
    [출력예시]
    47
    x        
*/
public class A1002개념연습10 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int r = ran.nextInt(90) + 10;
		System.out.println(r);
		
		int a = r / 10;
		int b = r % 10;
		
		 boolean c = a % 2 == 0 && b % 2 == 0;
		 boolean d = a % 2 == 1 && b % 2 == 1;
		 boolean e = c || d;

		    if(e) {
		        System.out.println("o");
		    }
		    if(!e) {
		    	System.out.println("x");
		    }
	}
}
