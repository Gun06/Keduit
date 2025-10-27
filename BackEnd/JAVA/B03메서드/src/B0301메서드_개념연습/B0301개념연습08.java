package B0301메서드_개념연습;

import java.util.Random;

public class B0301개념연습08 {
	/*
		 [문제]  
			철수는 편의점에서 아르바이트를 하고있다.
			현재 편의점에 준비된 잔돈은 아래와 같다.  
			각각 순서대로 a b c d 변수로 표현한다. 
			5000원권 3매
			1000원권 4매
			500원권 3개
			100원권 3개 
			현재 거스름돈을 8900원 거슬러줘야할때, 
			거스름돈이 충분하면 "8900원입니다" 출력,
			거스름돈이 부족하면 "거스름돈이부족합니다" 출력하시오. 
			100원이 3개 이기 때문에 잔돈이 부족하다.
		[정답]
			거스름돈이부족합니다		
	*/
	public static void solution(int a, int b, int c, int d , int charge ) {	
		int a1 = charge / 5000;
		int a2 = charge % 5000 / 1000;
		int a3 = charge % 1000 / 500;
		int a4 = charge % 500 / 100;
		
		System.out.println(a1 + " " + a2 + " " + a3 + " " + a4);
		
		if(a1 <= a&& a2 <= b && a3 <= c && a4 <= d) {
			System.out.println(charge + "원입니다.");
		}else {
			System.out.println("거스름돈이부족합니다.");
		}	
	}
	
	public static void main(String[] args) {
		Random ran = new Random();
		int a = 3;
		int b = 4;
		int c = 3;
		int d = 3;
		int charge = 8900;
		solution(a , b, c , d , charge);
	}
}
