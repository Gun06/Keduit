package B0301메서드_개념;

import java.util.Random;

public class B0301개념04_동전한개 {
	/*
	  	랜덤 동전을 던저 동전의 앞뒤를 판별하는 함수를 만들어보자.
	 
	 */
	public static void check(int coin) {
		if(coin == 1) {
			System.out.println("앞");
		}else if(coin == 2) {
			System.out.println("뒤");
		}
	}
	
	public static void main(String[] args) {
		
		Random ran = new Random();
		int r = ran.nextInt(2) + 1;
		System.out.println(r);
		check(r);
	}

}
