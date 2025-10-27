package B0301메서드_개념연습;

import java.util.Random;

public class B0301개념연습01 {
	/*
		[문제] 
			철수는 학교에서 시험을 치뤘다. 
			시험점수가 60 이상이고, 100 이하이면 합격이다.
			랜덤숫자(0~100)를 한개 저장후 철수가 합격이면 "합격" ,
			불합격이면 "불합격" 을 출력하시오.
		[예시] 
			54
			불합격
	*/
	public static void solution(int a) {
		if(60 <= a && a <= 100){
			System.out.println("합격");
		}
		if(0 <= a && a < 60){
			System.out.println("불합격");
		}
	}
	
	public static void main(String[] args) {
		Random ran = new Random();
		int score = ran.nextInt(101);
		solution(score);
	}

}
