package B0301메서드_개념;

import java.util.Random;

public class B0301개념05_숫자두개비교 {
	/*
    [문제]
        1부터 100 사이의 숫자 두 개를 랜덤으로 저장한다.
        두 숫자 중 더 큰 숫자를 출력하시오.
        단, 서로 같으면 "같다"를 출력하시오.
    [예시]
        76 5
        76
   */
	public static void compareNumber(int a, int b) {
		System.out.println(a + " " + b);
		if(a > b) {
			System.out.println(a);
        }
        if(a < b) {
        	System.out.println(b);
        }
        if(a == b) {
        	System.out.println("같다");
        }
	}
	
	public static void main(String[] args) {
		  
		
		Random ran = new Random();
		int r1 = ran.nextInt(100) + 1;
		int r2 = ran.nextInt(100) + 1;
		compareNumber(r1, r2);
	}

}
