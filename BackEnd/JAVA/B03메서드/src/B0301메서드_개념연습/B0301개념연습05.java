package B0301메서드_개념연습;

import java.util.Random;

public class B0301개념연습05 {
	/*
		 [문제]		  
            a는 0  ~ 9  사이의 랜덤 숫자를 저장한다.
            c는 11 ~ 20 사이의 랜덤 숫자를 저장한다. 
            a 와 c 중 어떤 숫자가 b 와 더 가까운지 출력하시오.
        
            [1] a가 b보다 가까우면 "a가 가깝다."
            [2] c가 a보다 가까우면 "c가 가깝다."
            [3] 서로 거리가 같으면 "서로 같다."
	*/
	public static void solution(int a , int b , int c) {
		
		int a1 = b - a;
		int c1 = c - b;
		 if(a1 < c1) {
			System.out.println("a가 가깝다");
		 }
		 if(a1 > c1) {
			 System.out.println("c가 가깝다");
		 }
		 if(a1 == c1) {
			 System.out.println("서로같다");
		 }
	}
	
	public static void main(String[] args) {
		Random ran = new Random();
		int a = ran.nextInt(10) + 1;
		int c = ran.nextInt(10) + 11;
		int b = 10;
		 System.out.println(a + " " + b + " " + c);
		 solution(a, b, c);
	}

}
