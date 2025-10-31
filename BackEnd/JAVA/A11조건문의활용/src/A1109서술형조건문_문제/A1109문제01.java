package A1109서술형조건문_문제;
/*
[문제]
철수네 학교에서는 이번 시험에서 장학생을 뽑고 있습니다.
시험 과목은 국어와 수학 두 과목입니다.
두 과목 중 한 과목이라도 100점을 받거나,
평균이 80점 이상이면 장학생이 됩니다.

0부터 100 사이의 랜덤 숫자 두 개를 저장한 후, 
철수의 점수가 장학생 대상이면 "장학생"을 출력하고, 
그렇지 않으면 "꽝"을 출력하시오.    
*/

import java.util.Random;

/*
[출력예시]
81 93
87
장학생

[출력예시]
86 11
48.5
꽝    
*/
public class A1109문제01 {
	public static void main(String[] args) {
		Random ran = new Random();
		int r1 = ran.nextInt(101);
		int r2 = ran.nextInt(101);
		System.out.println(r1 + " " + r2);

	    int a = r1 + r2;
	    double b = (double)a / 2;
	    System.out.println(b);

	    boolean c = r1 == 100 || r2 == 100;
	    boolean d = b >= 80;

	    if(c || d) {
	    	System.out.println("장학생");
	    	
	    }
	    
	    if(!c && !d) {
	    	System.out.println("꽝");
	    }
	}
}
