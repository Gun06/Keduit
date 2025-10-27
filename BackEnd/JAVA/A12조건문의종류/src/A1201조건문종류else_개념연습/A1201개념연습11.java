package A1201조건문종류else_개념연습;

import java.util.Random;

/*
[문제]
1부터 10 사이의 숫자를 랜덤으로 저장합니다.
저장된 숫자가 300의 약수이거나 50의 약수이면 "o"를, 
두 수 모두의 약수가 아니면 "x"를 출력하시오.
단, else를 사용하시오.
*/
/*
[출력예시]
4
o
*/
public class A1201개념연습11 {
public static void main(String[] args) {
		Random ran = new Random();
		int a = ran.nextInt(10) + 1;
		System.out.println(a);
		boolean b = 300 % a == 0;
	    boolean c = 50 % a == 0;
	    if(b || c){
	    	System.out.println("o");
	    }else{
	    	System.out.println("x");
	    }
	}
}
