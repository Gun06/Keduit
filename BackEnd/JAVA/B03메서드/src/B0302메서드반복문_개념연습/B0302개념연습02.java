package B0302메서드반복문_개념연습;

import java.util.Random;

public class B0302개념연습02 {

	public static void solution(int num) {
		System.out.println(num);
		int total = 0;
        int i = 1;
        while(i <= num) {
            if(num % i == 0) {
                System.out.print(i + " ");
                total += i;
            }
            i += 1;
        }
    
        System.out.println("합 = " + total);
	}
	
	public static void main(String[] args) {
		 /*
         [문제] 
            1~10 사이의 숫자를 랜덤으로 2개 저장하고,
            작은 숫자부터 큰 숫자까지의 합을 출력하는 함수를 만드시오.
        [예시]
            5, 3 ==> 3 + 4 + 5
            2, 6 ==> 2 + 3 + 4 + 5 + 6
		  */
		Random ran = new Random();
		int r = ran.nextInt(100) + 1;
		solution(r);
	}
}
