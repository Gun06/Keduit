package B0301메서드_개념연습;

import java.util.Random;

public class B0301개념연습03 {
	/*
		[문제]
            a 변수에 1부터 10 사이의 랜덤 숫자를 저장하고, 
            "짝수" 또는 "홀수"를 출력하시오.
	*/
	public static void solution(int a , int b , int c) {
		int max = a;
		if(max < b) {
            max = b;
        }
        if(max < c) {
            max = c;
        }
        System.out.println("최대값:"+max);

	}
	
	public static void main(String[] args) {
		Random ran = new Random();
		int number = ran.nextInt(1000) + 1;
		int number2 = ran.nextInt(1000) + 1;
		int number3 = ran.nextInt(1000) + 1;
		 System.out.println(number + " " + number2 + " " + number3);
		 solution(number, number2, number3);
	}

}
