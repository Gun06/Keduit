package B0302메서드반복문_개념연습;

import java.util.Random;

public class B0302개념연습04 {

	public static void solution(int r1 , int r2) {
		int count = 0;
		int i = 1;
		while(true) {
			if(i % r1 == 0) {
				count += 1;
				if(count == r2) {
					System.out.println(i);
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
				랜덤숫자 (4~ 8) 사이의 숫자를 저장한다. 위 배수의 순서를 뜻한다.
				랜덤숫자 의 배수를 출력하는데 그중에서 두번째 랜덤숫자의 순서의 배수만 출력한다.
	
			[예시] 2의 배수의 6번째 배열을 출력한다.
				2 6 		
				12
		  */
		Random ran = new Random();
		int r1 = ran.nextInt(8) + 2;
		int r2 = ran.nextInt(5) + 4;
		System.out.println(r1 + " " + r2);
		solution(r1, r2);
	}
}
