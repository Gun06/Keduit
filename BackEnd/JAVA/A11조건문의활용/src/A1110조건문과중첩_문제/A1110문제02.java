package A1110조건문과중첩_문제;
/*
[문제]
a = 10

철수는 집 앞에 있는 산에 있습니다. 
산에는 100개의 계단이 있습니다.
현재 철수는 10번째 계단에 있습니다.  
a는 철수의 현재 위치를 나타냅니다.

[조건]
(1) 1에서 10 사이의 랜덤 숫자를 b에 저장하고, 1에서 2사이의 랜덤 숫자를 c에 저장합니다.
(2) c의 값이 1이면, 철수는 계단 위로 b만큼 이동합니다.
(3) c의 값이 2이면, 철수는 계단 아래로 b만큼 이동합니다.
(3) b가 짝수이면, 두배 만큼 이동합니다.
(4) 철수의 위치가 0이 되면 더 이상 내려갈 수 없습니다.
(5) 중첩 반복문을 활용하시오.
이동 후 철수의 현재 위치를 출력하시오.    
*/

import java.util.Random;

/*
[출력예시]
4 2
2

[출력예시]
6 2
0    
*/
public class A1110문제02 {
	public static void main(String[] args) {
		Random ran = new Random();
		int a = 10;
		int b = ran.nextInt(10) + 1;
		int c = ran.nextInt(2) + 1;
		System.out.println(b + " " + c);
		 
		if(c == 1) {
	        a = a + b;
	        if(b % 2 == 0) {
	            a = a + b;
	        }
	    }
	    if(c == 2) {
	        a = a - b;
	        if(b % 2 == 0) {
	            a = a - b;
	        }
	        if(a < 0) {
	            a = 0;
	        }
	    }
	    System.out.println(a);
	}
}
