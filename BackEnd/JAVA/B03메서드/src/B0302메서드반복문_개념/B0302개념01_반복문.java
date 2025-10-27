package B0302메서드반복문_개념;

import java.util.Random;

public class B0302개념01_반복문 {

	public static void solution(int a) {
		int total = 0;
		for(int i = 1; i <= a; i++) {
			total += i;
		}
		System.out.println(a + " " + total);	
	}
	
	public static void main(String[] args) {
		 /*
	        [문제]
	            1~10 사이의 숫자를 랜덤으로 저장하고,  
	            1~ 랜덤 숫자까지의 합을 출력하는 함수를 만드시오.
	        [정답]
	            1부터 10까지의 합 : 55
		  */
		Random ran = new Random();
		int r = ran.nextInt(10) + 1;
		solution(r);
	}
}
