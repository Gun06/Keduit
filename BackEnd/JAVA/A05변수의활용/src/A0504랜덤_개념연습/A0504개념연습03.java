package A0504랜덤_개념연습;
/*
[문제]
시험 점수는 0에서 100 사이이며, 항상 5점 단위로만 나옵니다. 
예를 들어, 92점은 나올 수 없습니다. 
철수와 민수와 영희는 시험을 보았다. 
세학생의 각각의 점수와 총점과 평균을 출력하시오.   
단, 평균은 소수점 두 자리까지 출력하시오.      
*/

import java.util.Random;

/*
[출력예시]
55
55
30
140
46.67
*/
public class A0504개념연습03 {
	public static void main(String[] args) {
		Random ran = new Random();
		int a = ran.nextInt(20) + 1;
		a = a * 5;
		int b = ran.nextInt(20) + 1;
		b = b * 5;
		int c = ran.nextInt(20) + 1;
		c = c * 5;
		int total = a + b + c;
		double avg = (double)total / 3;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(total);
		System.out.println(String.format("%.2f", avg));
	}
}
