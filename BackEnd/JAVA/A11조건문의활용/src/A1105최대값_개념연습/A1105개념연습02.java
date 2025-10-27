package A1105최대값_개념연습;
/*
[문제]
10부터 99 사이의 랜덤 숫자 세 개를 생성하여 저장합니다.
각각의 숫자의 자릿수를 더한 값을 구합니다.
자릿수의 합 중 최대값을 출력하시오.    
*/

import java.util.Random;

/*
[출력예시]
19 77 17
10 14 8
14   
*/
public class A1105개념연습02 {
	public static void main(String[] args) {
		Random ran = new Random();
		int r1= ran.nextInt(90) + 10;
		int r2= ran.nextInt(90) + 10;
		int r3= ran.nextInt(90) + 10;
		System.out.println(r1 + " " + r2 + " " + r3);
		
		int a1 = r1 / 10;
	    int a2 = r1 % 10;
	    int a3 = a1 + a2;

	    int b1 = r2 / 10;
	    int b2 = r2 % 10;
	    int b3 = b1 + b2;

		    int c1 = r3 / 10;
		    int c2 = r3 % 10;
		    int c3 = c1 + c2;
		    System.out.println(a3+ " "+ b3 +" "+ c3);

		    int max = 0;
		    if(max < a3) {
		        max = a3;
		    }
		    if(max < b3) {
		        max = b3;
		    }
		    if(max < c3) {
		        max = c3;
		    }
		    System.out.println(max);
		
	}
}
