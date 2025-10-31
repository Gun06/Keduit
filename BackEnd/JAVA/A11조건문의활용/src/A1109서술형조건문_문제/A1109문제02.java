package A1109서술형조건문_문제;

import java.util.Random;

/*
[문제]
0에서 100 사이의 랜덤 숫자를 시험 점수로 저장합니다.
시험 점수가 100부터 91이면 A학점, 90부터 81이면 B학점, 80 이하는 "재시험"입니다.
만점이거나, A학점과 B학점의 일의 자리가 8점 이상이면 + 기호를 추가하시오.    
*/

/*
[출력예시]
99
A+

[출력예시]
53
재시험    
*/
public class A1109문제02 {
	public static void main(String[] args) {
		Random ran = new Random();
		int r = ran.nextInt(101);
		System.out.println(r);
		
		if(98 <= r && r <= 100) {
	    	System.out.println("A+");
	    }
	    if(91 <= r && r < 98) {
	    	System.out.println("A");
	    }
	    if(88 <= r && r <= 90) {
	    	System.out.println("B+");
	    }
	    if(81 <= r && r < 88) {
	    	System.out.println("B");
	    }
	    if(0 <= r && r <= 80) {
	    	System.out.println("재시험");
	    }
	}
}
