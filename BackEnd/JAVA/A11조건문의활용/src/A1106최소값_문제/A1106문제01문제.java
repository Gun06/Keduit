package A1106최소값_문제;

import java.util.Random;
/*
[문제]
숫자 다섯 개를 1부터 1000 사이에서 랜덤으로 생성하여 저장합니다.
각 숫자의 일의 자리를 비교하여 가장 작은 일의 자리 숫자를 출력하시오.    
*/

/*
[출력예시]
467 988 972 66 925
2    
*/
public class A1106문제01문제 {
	public static void main(String[] args) {
		Random ran = new Random();
		int r1= ran.nextInt(1000) + 1;
		int r2= ran.nextInt(1000) + 1;
		int r3= ran.nextInt(1000) + 1;
		int r4= ran.nextInt(1000) + 1;
		int r5= ran.nextInt(1000) + 1;
		System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
		
	    int a = r1 % 10;
	    int b = r2 % 10;
	    int c = r3 % 10;
	    int d = r4 % 10;
	    int e = r5 % 10;

	    int min = 1000;
	    if(min > a) {
	        min = a;
	    }
	    if(min > b) {
	        min = b;
	    }
	    if(min > c) {
	        min = c;
	    }
	    if(min > d) {
	        min = d;
	    }
	    if(min > e) {
	        min = e;
	    }    
	    System.out.println(min);
	}
}
