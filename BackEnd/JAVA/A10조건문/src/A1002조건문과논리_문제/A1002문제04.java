package A1002조건문과논리_문제;
/*
[문제]
10000부터 90000 사이의 랜덤 숫자를 저장한 후, 
숫자의 첫 번째 자리와 마지막 자리의 숫자를 더한 값을 구하시오. 
그 합이 짝수이면 "짝수"를 출력하고, 홀수이면 "홀수"를 출력하는 프로그램을 작성하시오.    
*/

import java.util.Random;

/*
[출력예시]
72116
7 6
13
홀수   
*/
public class A1002문제04 {
	public static void main(String[] args) {
		Random ran = new Random();

		int r = ran.nextInt(80001) + 10000;
	    System.out.println(r);

	    int a = r / 10000;
	    int b = r % 10;
	    System.out.println(a + " " + b);
	    
	    int c = a + b;
	    System.out.println(c);
	    
	    boolean d = c % 2 == 0;
	    if(d) {
	        System.out.println("짝수");
	    }
	    if(!d) {
	        System.out.println("홀수");
	    }
	}
}
