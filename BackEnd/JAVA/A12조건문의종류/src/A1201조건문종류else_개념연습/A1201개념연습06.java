package A1201조건문종류else_개념연습;

import java.util.Random;

/*
[문제]
1부터 9사이의 랜덤숫자 3개를 각각 변수에 저장합니다.
첫번째 변수의 값이 가장 크면 "True"를 출력하고, 크지 않으면 "False"를 출력하시오.
단, else를 사용하시오.
*/
/*
[출력예시]
7 1 7
true

[출력예시]
2 7 7
false
*/
public class A1201개념연습06 {
public static void main(String[] args) {
		Random ran = new Random();
		int a = ran.nextInt(9) + 1;
		int b = ran.nextInt(9) + 1;
		int c = ran.nextInt(9) + 1;
		System.out.println(a + " " + b + " " + c);
	    boolean d = a >= b && a >= c;
	    if (d){
	    	System.out.println(true);
	    }else{
	    	System.out.println(false);
	    }
	}
}
