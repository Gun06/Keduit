package A0903논리와서술형_개념연습;

import java.util.Random;

/*
    [문제]
    국어 점수가 철수는 80점, 민수는 87점 입니다.
    두 학생의 점수 차이는 7이거나 -7 입니다.
    위 식을 논리연산자로 표현하고, 그 결과를 True 또는 False로 출력하시오. 
*/

/*
    [출력예시]
   	80
	87
	-7
	true 
*/

public class A0903개념연습04 {
	public static void main(String[] args) {
		Random ran = new Random();
		int a = 80;
		int b = 87;
		int c = a - b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);


		    boolean d = c == 7 || c == -7;
		    System.out.println(d);
	    
	}
}
