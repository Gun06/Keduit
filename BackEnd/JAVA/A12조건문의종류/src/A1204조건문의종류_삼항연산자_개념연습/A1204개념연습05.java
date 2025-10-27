package A1204조건문의종류_삼항연산자_개념연습;

import java.util.Random;
/*
[문제]
    랜덤으로 숫자 3이나 7을 출력하시오.
    단, 삼항연산자를 사용하시오.
*/
public class A1204개념연습05 {
	public static void main(String[] args) {
		
	
		Random ran = new Random();
		
		 int a = 0;
		 int b = 0;
		 
		 a = ran.nextInt(2) + 1;
		 System.out.println(a);

	     b = a == 1 ? 3 : 7;
	     System.out.println(b);
		
	}
}
