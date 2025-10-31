package A1108조건문과개수_문제;
/*
[문제]	  		
100부터 999 사이의 랜덤 숫자를 생성하여 저장합니다.
각 자리수를 저장한 후, 각 자리수에서 5 또는 8이 몇 개 있는지 확인하고 그 개수를 출력하시오.    
*/

import java.util.Random;

/*
[출력예시]
558
3    
*/
public class A1108문제01 {
	public static void main(String[] args) {
		Random ran = new Random();
		int r = ran.nextInt(900) + 100;
		System.out.println(r);
		
		int a = r / 100;
		int b = r % 100 / 10;
		int c = r %10;
		
		int count = 0;
	    if(a == 5 || a == 8) {
	        count = count + 1;
	    }
	    if(b == 5 || b == 8) {
	        count = count + 1;
	    }
	    if(c == 5 || c == 8) {
	        count = count + 1;
	    }
	    System.out.println(count);
	}
}
