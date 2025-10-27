package B0306리턴변수_개념;

import java.util.Random;

public class B0306개념03_리턴제곱 {	
	
	public static int getPower(int a) {
		int result = a * a;
		return result;
	}
	public static void main(String[] args) {	
		/*
		  [문제]	
  			랜덤숫자(2~9) 사이의 변수 두개를 저장한다.
	  		그 랜덤숫자들의 제곱의 합을 출력하시오.
	  		단 리턴함수를 사용하시오.
		 */		
		Random ran = new Random();
		int a = ran.nextInt(8) + 2;
		int b = ran.nextInt(8) + 2;
		
		System.out.println(a + " " + b);
		a = getPower(a);
		b = getPower(b);
		System.out.println(a + " " + b);
		int c = a + b;
		System.out.println(c);
	}
}
