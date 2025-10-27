package A1201조건문종류else_개념연습;

import java.util.Random;

/*
[문제]
철수는 암호 숫자를 만들었습니다. 
암호 숫자의 규칙은 모든 자리의 숫자가 짝수이거나, 모든 자리의 숫자가 홀수이면 통과입니다.
10부터 99 사이의 랜덤 숫자를 저장한 후, 해당 숫자가 암호 규칙을 통과하는지 확인하여 
"통과" 또는 "실패"를 출력하시오.
단, else를 사용하시오.
*/
/*
[출력예시]
17
통과

[출력예시]
34
실패
*/
public class A1201개념연습16 {
public static void main(String[] args) {
		Random ran = new Random();
		int a = ran.nextInt(90) + 10;
		System.out.println(a);
		int b = a / 10;
		int c = a % 10;
	    boolean d = b % 2 == 0 && c % 2 == 0;
	    boolean e = b % 2 == 1 && c % 2 == 1;
	    boolean f = d || e;
	    if(f){
	    	System.out.println("통과");
	    }else{
	    	System.out.println("실패");
	    }
	}
}
