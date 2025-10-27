package B0301메서드_개념연습;

import java.util.Random;

public class B0301개념연습06 {
	/*
		 [문제]
			[1] 0에서 100 사이의 랜덤 점수 2개를 저장해 평균을 구한다.
			[2] 평균이 60점 이상이면 합격, 60점 미만이면 불합격이다.
			[3] 단, 평균이 60 이상이라도, 한 과목이라도 50 미만이면 불합격을 출력하시오.
	*/
	public static void solution(int a , int b ) {	
		int total = a + b;
		double avg = (double)total / 2;
				
		if(avg >= 60 && a >= 50 && b >= 50) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}		 
	}
	
	public static void main(String[] args) {
		Random ran = new Random();
		int score1 = ran.nextInt(101) ;
		int score2 = ran.nextInt(101) ;
		System.out.println(score1 + " " + score2);
		solution(score1, score2);
	}

}
