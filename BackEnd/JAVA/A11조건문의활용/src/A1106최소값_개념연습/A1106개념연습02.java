package A1106최소값_개념연습;
/*
[문제]
10부터 99 사이의 랜덤 숫자 세 개를 생성하여 저장합니다.
각각의 숫자의 자릿를 더한 값을 구합니다.
자릿수의 합 중 최소값을 출력하시오.   
*/

import java.util.Random;

/*
[출력예시]
57 80 19
12 8 10
8    
*/
public class A1106개념연습02 {
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

	    int min = 99;
	    if(min > a3) {
	        min = a3;
	    }
	    if(min > b3) {
	        min = b3;
	    }
	    if(min > c3) {
	        min = c3;
	    }
	    System.out.println(min);
	}
}
