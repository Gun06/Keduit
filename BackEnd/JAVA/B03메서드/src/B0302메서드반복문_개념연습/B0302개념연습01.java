package B0302메서드반복문_개념연습;

import java.util.Random;

public class B0302개념연습01 {

	public static void solution(int r1, int r2) {
		 if(r1 > r2) {
            int temp = r1;
            r1 = r2;
            r2 = temp;
        }

        int total = 0;
        for(int i = r1; i <= r2; i++) {
            System.out.print(i);
            if(i < r2) {
                System.out.print("+");
            }
            total += i;
        }
        System.out.println("=" + total);
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
		int r1 = ran.nextInt(10) + 1;
		int r2 = ran.nextInt(10) + 1;
		solution(r1, r2);
	}
}
