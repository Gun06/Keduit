package A1204조건문의종류_삼항연산자_개념연습;

import java.util.Random;
/*
[문제]
	[1] 0에서 100 사이의 랜덤 점수 2개를 저장해 평균을 구한다.
	[2] 평균이 60점 이상이면 true, 60점 미만이면 false이다.
	[3] 단, 평균이 60 이상이라도, 한 과목이라도 50 미만이면 false를 출력하시오.
	[4] 단, 삼항연산자 를 사용하시오.
*/
public class A1204개념연습03 {
	public static void main(String[] args) {
		
		
		Random ran = new Random();
		
		int score1 = 0;
		int score2 = 0;
		int total = 0;
		double avg = 0;
		boolean a = false;
		boolean result = false;
		
		score1 = ran.nextInt(101);
		score2 = ran.nextInt(101);
		System.out.println(score1 + ", " + score2);

		total = score1 + score2;
		avg = total / 2.0;
		System.out.println(avg);

		a = avg >= 60 && score1 >= 50 && score2 >= 50;

		result = a ? true : false;

		System.out.println(result);
		
	}
}
