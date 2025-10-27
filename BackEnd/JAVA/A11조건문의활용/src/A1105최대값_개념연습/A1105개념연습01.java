package A1105최대값_개념연습;
/*
[문제]
숫자 다섯 개를 1부터 1000 사이에서 랜덤으로 생성하여 저장합니다.
다섯 개의 각 랜덤 숫자의 십의 자리를 비교하여 가장 큰 십의 자리 숫자를 출력하시오.    
*/

import java.util.Random;

/*
[출력예시]
765 962 996 222 49
9    
*/
public class A1105개념연습01 {
	public static void main(String[] args) {
		Random ran = new Random();
		int r1= ran.nextInt(1000) + 1;
		int r2= ran.nextInt(1000) + 1;
		int r3= ran.nextInt(1000) + 1;
		int r4= ran.nextInt(1000) + 1;
		int r5= ran.nextInt(1000) + 1;
		System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
		
	    int a = r1 % 100 / 10;
	    int b = r2 % 100 / 10;
	    int c = r3 % 100 / 10;
	    int d = r4 % 100 / 10;
	    int e = r5 % 100 / 10;

	    int max = 0;
	    if(max < a) {
	        max = a;
	    }
	    if(max < b) {
	        max = b;
	    }
	    if(max < c) {
	        max = c;
	    }
	    if(max < d) {
	        max = d;
	    }
	    if(max < e) {
	        max = e;
	    }    
	    System.out.println(max);
	}
}
