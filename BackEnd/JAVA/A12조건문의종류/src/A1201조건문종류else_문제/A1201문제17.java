package A1201조건문종류else_문제;

import java.util.Random;

/*
[문제]
10000부터 90000 사이의 랜덤 숫자를 저장합니다.
저장된 숫자의 첫 번째 자리와 마지막 자리의 숫자를 더합니다.
그 합이 짝수이면 "짝수"를 출력하고, 그 합이 홀수이면 "홀수"를 출력하시오.
단, else를 사용하시오.
*/
/*
[출력예시]
50865
5 5
10
짝수

[출력예시]
38904
3 4
7
홀수
*/
public class A1201문제17 {
	public static void main(String[] args) {
		Random ran = new Random();
		int a = ran.nextInt(90001) + 10000;
		int b = a / 10000;
		int c = a % 10;
		System.out.println(b + " " + c);
		int d = b + c;
	    boolean e = d % 2 == 0;
	    if(e){
	    	System.out.println("짝수");
	    }else{
	    	System.out.println("홀수");
	    }
	}
}
