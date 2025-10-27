package A1104절대값_개념연습;
/*
[문제]
a는 1에서 9 사이의 랜덤 숫자를 저장합니다.
b 변수에 5를 저장합니다.
c는 1에서 9 사이의 랜덤 숫자를 저장합니다.
a와 c 중에서 어떤 숫자가 b와 더 가까운지 비교하여 다음을 출력하시오.

[조건]
(1) a가 c보다 가까우면 "a가 가깝다"
(2) c가 a보다 가까우면 "c가 가깝다"
(3) a와 c의 거리가 같으면 "서로 같다"     
*/

import java.util.Random;

/*
[출력예시]
5
7 5
2 0
c가 가깝다

[출력예시]
5
6 4
1 1
서로 같다
*/
public class A1104개념연습03 {
	public static void main(String[] args) {
		Random ran = new Random();
		int a = ran.nextInt(9) + 1;
		int b = 5;
		int c = ran.nextInt(9) + 1;
		System.out.println(b);
		System.out.println(a + " " + c);
		
	    int d = b - a;
	    if(d < 0) {
	        d = -d;
	    }
	    int e = b - c;
	    if(e < 0) {
	        e = -e;
	    }
	    System.out.println(d + " " + e);

	    if(d < e) {
	    	System.out.println("a가 가깝다");
	    }
	    if(e < d) {
	    	System.out.println("c가 가깝다");
	    }
	    if(d == e) {
	    	System.out.println("서로 같다");
	    }
	}
}
