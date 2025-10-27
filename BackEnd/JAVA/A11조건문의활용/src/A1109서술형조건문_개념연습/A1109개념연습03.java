package A1109서술형조건문_개념연습;

import java.util.Random;

/*
[문제]
시험점수의 평균이 60점 이상이면 합격입니다.
단, 한과목이라도 50점미만이면 과락입니다.     
0에서 100 사이의 랜덤 숫자 두개를 시험 점수로 저장하고, 그 결과를 출력하시오.
*/

/*
[출력예시]
63 87
75
합격

[출력예시]
49 88
68.5
불합격   
*/
public class A1109개념연습03 {
	public static void main(String[] args) {
		Random ran = new Random();
		int r1 = ran.nextInt(101);
		int r2 = ran.nextInt(101);
		System.out.println(r1 + " " + r2);

	    int a = r1 + r2;
	    double b = (double)a / 2;
	    System.out.println(b);
	    boolean c = b >= 60;
	    boolean d = r1 >= 50 && r2 >= 50;
	    boolean e = c && d;

	    if(e) {
	    	System.out.println("합격");
	    }
	    if(!e) {
	    	System.out.println("불합격");
	    }
	}
}
