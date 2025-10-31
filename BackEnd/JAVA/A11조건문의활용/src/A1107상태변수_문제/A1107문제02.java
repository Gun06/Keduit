package A1107상태변수_문제;
/*
[문제]
a = 10
b = 20
c = 30

랜덤 숫자 1 또는 2를 저장합니다.
1이 나오면 a와 b의 값을 교환하고,
2가 나오면 a와 c의 값을 교환한 후 출력하시오.    
*/

import java.util.Random;

/*
[출력예시]
1
20 10 30

[출력예시]
2
30 20 10    
*/
public class A1107문제02 {
	public static void main(String[] args) {
		Random ran = new Random();
		int a = 10;
	    int b = 20;
	    int c = 30;
	    System.out.println(a + " " + b + " " + c);
	    int r = ran.nextInt(2) + 1;
	    System.out.println(r);
	    

	    if(r == 1) {
	        int a1 = b;
	        int b1 = a;

	        a = a1;
	        b = b1;
	    }
	    if(r == 2) {
	        int a1 = c;
	        int c1 = a;

	        a = a1;
	        c = c1;
	    }
	    System.out.println(a + " " + b + " " + c);
	}
}
