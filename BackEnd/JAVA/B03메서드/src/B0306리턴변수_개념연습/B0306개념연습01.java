package B0306리턴변수_개념연습;

import java.util.Random;

public class B0306개념연습01 {	
	
	public static boolean getMultiple(int a) {
		if(a % 3 == 0) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {	
		/*
		  [문제]	
  			랜덤숫자(2~9) 사이의 변수 두개를 저장한다.
	  		그 랜덤숫자가 둘다 3의 배수이면 당첨, 그외는 꽝 을 출력하시오.
	  		단 리턴함수를 사용하시오.
		 */		
		Random ran = new Random();
		int a = ran.nextInt(8) + 2;
		int b = ran.nextInt(8) + 2;
		
		System.out.println(a + " " + b);
		boolean c = getMultiple(a);
		boolean d = getMultiple(b);
		System.out.println(c + " " + d);
		if(c && d) {
			System.out.println("당첨");
		}else {
			System.out.println("꽝");
		}
	}
}
