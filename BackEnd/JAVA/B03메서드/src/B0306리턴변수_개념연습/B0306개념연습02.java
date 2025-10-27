package B0306리턴변수_개념연습;

import java.util.Random;

public class B0306개념연습02 {	
	
	public static int getDivsor(int a) {
		int count = 0;
		for(int i = 1; i <= a; i++) {
			if(a % i == 0) {
				System.out.print(i + " ");
				count += 1;
			}
		}
		System.out.println();
		return count;
	}
	public static void main(String[] args) {	
		/*
		  [문제]	
  			랜덤숫자(10~30) 사이의 변수 두개를 저장한다.
	  		두숫자의 약수를 비교해서 약수의 개수가 더많은수를 출력하시오.
	  		서로 같으면 "같다" 를 출력하시오.
		 */		
		Random ran = new Random();
		int a = ran.nextInt(8) + 2;
		int b = ran.nextInt(8) + 2;
		
		System.out.println(a + " " + b);
		int c = getDivsor(a);
		int d = getDivsor(b);
		System.out.println(c + " " + d);
		if(c > d) {
			System.out.println(a);
		}else if(d > c) {
			System.out.println(b);
		}else {
			System.out.println("같다");
		}
	}
}
