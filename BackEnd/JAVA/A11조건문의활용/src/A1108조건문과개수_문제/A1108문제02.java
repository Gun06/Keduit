package A1108조건문과개수_문제;
/*
[문제]	 
100부터 999 사이의 랜덤 숫자를 생성하여 저장합니다.
각 자리수를 저장한 후, 각 자리수에서 3과 5가 각각 몇 개 있는지 확인하고 그 개수를 출력하시오.    
*/

import java.util.Random;

/*
[출력예시]
154
0
1   
*/
public class A1108문제02 {
	public static void main(String[] args) {
		Random ran = new Random();
		int r = ran.nextInt(900) + 100;
		System.out.println(r);
		
		int a = r / 100;
		int b = r % 100 / 10;
		int c = r %10;
		
		int count1 = 0;
	    if(a == 3) {
	        count1 = count1 + 1;
	    }
	    if(b == 3) {
	        count1 = count1 + 1;
	    }
	    if(c == 3) {
	        count1 = count1 + 1;
	    }
	    System.out.println(count1);

	    int count2 = 0;
	    if(a == 5) {
	        count2 = count2 + 1;
	    }
	    if(b == 5) {
	        count2 = count2 + 1;
	    }
	    if(c == 5) {
	        count2 = count2 + 1;
	    }    
	    System.out.println(count2);
	}
}
