package A1201조건문종류else_개념연습;

import java.util.Random;

/*
[문제]
철수는 암호 숫자를 만들었습니다. 
암호 숫자의 규칙은 두 자리 숫자 중 한 자리는 짝수, 다른 한 자리는 홀수여야 통과입니다. 
홀수와 짝수의 순서는 상관없습니다.
10부터 99 사이의 랜덤 숫자를 저장한 후, 해당 숫자가 암호를 통과하는지 확인하여 
"통과" 또는 "실패"를 출력하시오.
단, else를 사용하시오.
*/
/*
[출력예시]
16
통과

[출력예시]
80
실패
*/
public class A1201개념연습14 {
public static void main(String[] args) {
		Random ran = new Random();
		int a = ran.nextInt(90) + 10;
		System.out.println(a);
		int b = a / 10;
		int c = a % 10;
		 
	    boolean d = b % 2 == 0 && c % 2 == 1;
	    boolean e = b % 2 == 1 && c % 2 == 0;
	    boolean f = d || e;
	    if(f){
	    	System.out.println("통과");
	    }else{
	    	System.out.println("실패");
	    }
	}
}
