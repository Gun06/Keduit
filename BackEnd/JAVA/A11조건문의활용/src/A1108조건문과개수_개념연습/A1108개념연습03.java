package A1108조건문과개수_개념연습;
/*
[문제]	  
100부터 999 사이의 랜덤 숫자를 생성하여 저장합니다.
각 자리수를 확인하여 다음 조건에 맞는 값을 출력하시오.

[조건]
(1) 각각의 자리수가 모두 짝수이면, 세 자리 숫자의 합을 출력합니다.
(2) 각각의 자리수가 모두 홀수이면, 가장 앞에 있는 숫자에서 나머지 숫자들을 뺀 값을 출력합니다.
(3) 위 두 경우가 아니면, 세 자리 숫자들을 모두 곱한 값을 출력합니다.    
*/

import java.util.Random;

/*
[출력예시]
848
20

[출력예시]
579
-11

[출력예시]
231
6   
*/
public class A1108개념연습03 {
	public static void main(String[] args) {
		Random ran = new Random();
		int r = ran.nextInt(900) + 100;
		System.out.println(r);
		
		int a = r / 100;
		int b = r % 100 / 10;
		int c = r %10;

		    int count = 0;
		    if(a % 2 == 0) {
		        count = count + 1;
		    }
		    if(b % 2 == 0) {
		        count = count + 1;
		    }
		    if(c % 2 == 0) {
		        count = count + 1;
		    }
		    
		    int d = 0;
		    if(count == 3) {
		        d = a + b + c;
		    }
		    if(count == 0) {
		        d = a - b - c;
		    }
		    if(0 < count && count < 3) {
		        d = a * b * c;
		    }
		    System.out.println(d);
	}
}
