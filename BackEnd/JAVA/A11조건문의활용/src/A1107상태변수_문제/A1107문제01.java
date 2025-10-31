package A1107상태변수_문제;

import java.util.Random;

/*
[문제]
a = 50

철수는 집 앞에 있는 산에 있습니다. 
산에는 100개의 계단이 있습니다.
현재 철수는 50번째 계단에 있습니다.  
a는 철수의 현재 위치를 나타냅니다.

1에서 10 사이의 랜덤 숫자를 b에 저장하고, 1에서 2사이의 랜덤 숫자를 c에 저장합니다.
c의 값이 1이면, 철수는 계단 위로 b만큼 이동하고,
c의 값이 2이면, 철수는 계단 아래로 b만큼 이동합니다.
이동 후 철수의 현재 위치를 출력하시오.    
*/

/*
[출력예시]
50
4 1
54

[출력예시]
50
8 2
42   
*/
public class A1107문제01 {
	public static void main(String[] args) {
		Random ran = new Random();
		int a = 50;
	    System.out.println(a);
	    
	    int b = ran.nextInt(10) + 1;
	    int c = ran.nextInt(2) + 1;
	    System.out.println(b + " " + c);

	    
	    if(c == 1) {
	        a = a + b;
	    }
	    if(c == 2) {
	        a = a - b;
	    }
	    System.out.println(a);
	}
}
