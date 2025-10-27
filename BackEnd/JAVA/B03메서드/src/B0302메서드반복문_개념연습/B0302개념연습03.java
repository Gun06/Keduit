package B0302메서드반복문_개념연습;

import java.util.Random;

public class B0302개념연습03 {

	public static void solution(int r1 , int r2) {
		int count = 0;
		int i = 1;
		while(true) {
			if(i % r1 == 0) {
				System.out.println(i);
				count += 1;
				if(count == r2) {
					break;
				}
			}
			i += 1;
		}
	}
	
	public static void main(String[] args) {
		 /*
         [문제] 
			랜덤숫자 (2~9) 사이의 숫자를 저장한다. 랜덤숫자는 구하려는 배수를 뜻한다.
			랜덤숫자 (4~ 8) 사이의 숫자를 저장한다. 위 배수의 개수를 뜻한다.
			랜덤숫자 의 배수를 랜덤숫자의 개수만큼 구하시오.
		[예시] 2의 배수를 6개 구하시오.
			2 6 

			2
			4
			6
			8
			10
			12
		  */
		Random ran = new Random();	
		int r = ran.nextInt(8) + 2;
		int r2 = ran.nextInt(5) + 4;
		System.out.println(r + " " + r2);
		solution(r, r2);
		
	}
}
